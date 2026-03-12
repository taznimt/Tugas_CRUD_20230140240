# Praktikum 2 - CRUD KTP

## Deskripsi
Project ini merupakan aplikasi CRUD data KTP menggunakan:
- Spring Boot
- MySQL
- Spring Data JPA
- HTML
- CSS
- JavaScript
- Ajax jQuery

Aplikasi ini memiliki fitur:
- tambah data KTP
- lihat seluruh data KTP
- lihat data KTP berdasarkan id
- edit data KTP
- hapus data KTP

---

## Database
Schema: `spring`  
Table: `ktp`

Kolom:
- `id` : INT, Primary Key, Auto Increment
- `nomorKtp` : VARCHAR, Unique
- `namaLengkap` : VARCHAR
- `alamat` : VARCHAR
- `tanggalLahir` : DATE
- `jenisKelamin` : VARCHAR

---

## Struktur Package
Package yang digunakan:
- `model`
- `entity`
- `dto`
- `repository`
- `service`
- `impl`
- `util`
- `mapper`
- `controller`

---

## Endpoint API

### 1. POST /ktp
Digunakan untuk menambah data KTP baru.

**Request Body**
```json
{
  "nomorKtp": "3276010101010001",
  "namaLengkap": "Haechan",
  "alamat": "Jl. Mawar No. 10",
  "tanggalLahir": "2001-06-15",
  "jenisKelamin": "Laki-laki"
}
```

**Response Success**
```json
{
  "message": "Data KTP berhasil ditambahkan",
  "data": {
    "id": 1,
    "nomorKtp": "3276010101010001",
    "namaLengkap": "Haechan",
    "alamat": "Jl. Mawar No. 10",
    "tanggalLahir": "2001-06-15",
    "jenisKelamin": "Laki-laki"
  }
}
```

### 2. GET /ktp
Digunakan untuk mengambil seluruh data KTP.

**Response Success**
```json
{
  "message": "Berhasil mengambil seluruh data KTP",
  "data": [
    {
      "id": 1,
      "nomorKtp": "3276010101010001",
      "namaLengkap": "Haechan",
      "alamat": "Jl. Mawar No. 10",
      "tanggalLahir": "2001-06-15",
      "jenisKelamin": "Laki-laki"
    }
  ]
}
```

### 3. GET /ktp/{id}
Digunakan untuk mengambil data KTP berdasarkan id.

**Response Success**
```json
{
  "message": "Berhasil mengambil data KTP",
  "data": {
    "id": 4,
    "nomorKtp": "3276010101010001",
    "namaLengkap": "Haechan",
    "alamat": "Jl. Mawar No. 10",
    "tanggalLahir": "2001-06-15",
    "jenisKelamin": "Laki-laki"
  }
}
```

**Response Failed**
```json
{
  "message": "Data KTP dengan id 99 tidak ditemukan"
}
```

### 4. PUT /ktp/{id}
Digunakan untuk memperbarui data KTP berdasarkan id.

**Request Body**
```json
{
  "nomorKtp": "3276010101010001",
  "namaLengkap": "Zhang Linghe",
  "alamat": "Jl. Melati No. 20",
  "tanggalLahir": "2001-06-15",
  "jenisKelamin": "Laki-laki"
}
```

**Response Success**
```json
{
  "message": "Data KTP berhasil diperbarui",
  "data": {
    "id": 1,
    "nomorKtp": "3276010101010001",
    "namaLengkap": "Zhang Linghe",
    "alamat": "Jl. Melati No. 20",
    "tanggalLahir": "2001-06-15",
    "jenisKelamin": "Laki-laki"
  }
}
```

### 5. DELETE /ktp/{id}
Digunakan untuk menghapus data KTP berdasarkan id.

**Response Success**
```json
{
  "message": "Data KTP berhasil dihapus",
  "data": null
}
```

## Screenshot

### Halaman Utama
![Halaman Utama](./screenshoot/img.png)

### Tambah Data
![Tambah Data](./screenshoot/img_1.png)

### Data Berhasil Ditambahkan
![Data berhasil ditambahkan](./screenshoot/img_2.png)

### Edit Data
![Edit data](./screenshoot/img_3.png)

### Data Berhasil Diedit
![Data berhasil diedit](./screenshoot/img_4.png)

### Hapus Data
![Hapus Data](./screenshoot/img_5.png)

### Data Berhasil Dihapus
![Data berhasil dihapus](./screenshoot/img_6.png)

### Format Date
![Format date](./screenshoot/img_7.png)

### Dropdown Jenis Kelamin
![Dropdown jenis kelamin](./screenshoot/img_8.png)

### No KTP Wajib Diisi
![No KTP wajib diisi](./screenshoot/img_9.png)

### No KTP Harus 16 Digit
![No KTP harus 16 digit](./screenshoot/img_10.png)

### No KTP Sudah Ada
![No KTP sudah ada](./screenshoot/img_11.png)

### Nama Lengkap Wajib Diisi
![Nama lengkap wajib diisi](./screenshoot/img_12.png)

### Alamat Wajib Diisi
![Alamat wajib diisi](./screenshoot/img_13.png)

### Tanggal Lahir Wajib Diisi
![Jenis Kelamin wajib diisi](./screenshoot/img_14.png)

### Database
![Database](./screenshoot/img_15.png)

### Database 1
![Database1](./screenshoot/img_16.png)
