const API_URL = 'http://localhost:8080/ktp';

$(document).ready(function () {
    loadData();

    $('#ktpForm').on('submit', function (e) {
        e.preventDefault();

        const id = $('#ktpId').val();
        const payload = getFormData();

        if (id) {
            updateData(id, payload);
        } else {
            createData(payload);
        }
    });


    $('#cancelEdit').on('click', resetForm);
});

function getFormData() {
    return {
        nomorKtp: $('#nomorKtp').val().trim(),
        namaLengkap: $('#namaLengkap').val().trim(),
        alamat: $('#alamat').val().trim(),
        tanggalLahir: $('#tanggalLahir').val(),
        jenisKelamin: $('#jenisKelamin').val()
    };
}

function loadData() {
    $.ajax({
        url: API_URL,
        method: 'GET',
        success: function (response) {
            renderTable(response.data || []);
        },
        error: function (xhr) {
            showNotification(getErrorMessage(xhr), 'error');
            renderTable([]);
        }
    });
}

function createData(payload) {
    $.ajax({
        url: API_URL,
        method: 'POST',
        contentType: 'application/json',
        data: JSON.stringify(payload),
        success: function (response) {
            showNotification(response.message, 'success');
            resetForm();
            loadData();
        },
        error: function (xhr) {
            showNotification(getErrorMessage(xhr), 'error');
        }
    });
}

function editData(id) {
    $.ajax({
        url: `${API_URL}/${id}`,
        method: 'GET',
        success: function (response) {
            const item = response.data;

            $('#ktpId').val(item.id);
            $('#nomorKtp').val(item.nomorKtp);
            $('#namaLengkap').val(item.namaLengkap);
            $('#alamat').val(item.alamat);
            $('#tanggalLahir').val(item.tanggalLahir);
            $('#jenisKelamin').val(item.jenisKelamin);

            $('#form-title').text('Edit Data KTP');
            $('#cancelEdit').removeClass('hidden');
            $('.btn.primary').text('Update');

            window.scrollTo({ top: 0, behavior: 'smooth' });
        },
        error: function (xhr) {
            showNotification(getErrorMessage(xhr), 'error');
        }
    });
}

function updateData(id, payload) {
    $.ajax({
        url: `${API_URL}/${id}`,
        method: 'PUT',
        contentType: 'application/json',
        data: JSON.stringify(payload),
        success: function (response) {
            showNotification(response.message, 'success');
            resetForm();
            loadData();
        },
        error: function (xhr) {
            showNotification(getErrorMessage(xhr), 'error');
        }
    });
}

function deleteData(id) {
    if (!confirm('Yakin ingin menghapus data ini?')) {
        return;
    }

    $.ajax({
        url: `${API_URL}/${id}`,
        method: 'DELETE',
        success: function (response) {
            showNotification(response.message, 'success');
            loadData();
        },
        error: function (xhr) {
            showNotification(getErrorMessage(xhr), 'error');
        }
    });
}

function renderTable(data) {
    const tableBody = $('#ktpTableBody');
    tableBody.empty();

    if (!data.length) {
        tableBody.append(`
            <tr>
                <td colspan="7" class="empty">Belum ada data KTP</td>
            </tr>
        `);
        return;
    }

    data.forEach(item => {
        tableBody.append(`
            <tr>
                <td>${item.id}</td>
                <td>${item.nomorKtp}</td>
                <td>${item.namaLengkap}</td>
                <td>${item.alamat}</td>
                <td>${item.tanggalLahir}</td>
                <td>${item.jenisKelamin}</td>
                <td>
                    <div class="action-group">
                        <button class="btn warning" onclick="editData(${item.id})">Edit</button>
                        <button class="btn danger" onclick="deleteData(${item.id})">Hapus</button>
                    </div>
                </td>
            </tr>
        `);
    });
}

function resetForm() {
    $('#ktpForm')[0].reset();
    $('#ktpId').val('');
    $('#form-title').text('Tambah Data KTP');
    $('#cancelEdit').addClass('hidden');
    $('.btn.primary').text('Simpan');
}

function showNotification(message, type) {
    const notification = $('#notification');
    notification.removeClass('hidden success error').addClass(type).text(message);

    setTimeout(() => {
        notification.addClass('hidden');
    }, 4000);
}

function getErrorMessage(xhr) {
    if (xhr.responseJSON) {
        if (xhr.responseJSON.message === 'Validasi gagal' && xhr.responseJSON.data) {
            return Object.values(xhr.responseJSON.data).join(', ');
        }
        return xhr.responseJSON.message || 'Terjadi kesalahan';
    }
    return 'Tidak dapat terhubung ke server';
}