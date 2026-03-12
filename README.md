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
  "namaLengkap": "Tasnim Fadilah Anwar",
  "alamat": "Jl. Mawar No. 10",
  "tanggalLahir": "2001-06-15",
  "jenisKelamin": "Perempuan"
}

Response Success

{
  "message": "Data KTP berhasil ditambahkan",
  "data": {
    "id": 1,
    "nomorKtp": "3276010101010001",
    "namaLengkap": "Tasnim Fadilah Anwar",
    "alamat": "Jl. Mawar No. 10",
    "tanggalLahir": "2001-06-15",
    "jenisKelamin": "Perempuan"
  }
}
2. GET /ktp

Digunakan untuk mengambil seluruh data KTP.

Response Success

{
  "message": "Berhasil mengambil seluruh data KTP",
  "data": [
    {
      "id": 1,
      "nomorKtp": "3276010101010001",
      "namaLengkap": "Tasnim Fadilah Anwar",
      "alamat": "Jl. Mawar No. 10",
      "tanggalLahir": "2001-06-15",
      "jenisKelamin": "Perempuan"
    }
  ]
}
3. GET /ktp/{id}

Digunakan untuk mengambil data KTP berdasarkan id.

Response Success

{
  "message": "Berhasil mengambil data KTP",
  "data": {
    "id": 1,
    "nomorKtp": "3276010101010001",
    "namaLengkap": "Tasnim Fadilah Anwar",
    "alamat": "Jl. Mawar No. 10",
    "tanggalLahir": "2001-06-15",
    "jenisKelamin": "Perempuan"
  }
}

Response Failed

{
  "message": "Data KTP dengan id 99 tidak ditemukan"
}
4. PUT /ktp/{id}

Digunakan untuk memperbarui data KTP berdasarkan id.

Request Body

{
  "nomorKtp": "3276010101010001",
  "namaLengkap": "Tasnim Fadilah Anwar Update",
  "alamat": "Jl. Melati No. 20",
  "tanggalLahir": "2001-06-15",
  "jenisKelamin": "Perempuan"
}

Response Success

{
  "message": "Data KTP berhasil diperbarui",
  "data": {
    "id": 1,
    "nomorKtp": "3276010101010001",
    "namaLengkap": "Tasnim Fadilah Anwar Update",
    "alamat": "Jl. Melati No. 20",
    "tanggalLahir": "2001-06-15",
    "jenisKelamin": "Perempuan"
  }
}
5. DELETE /ktp/{id}

Digunakan untuk menghapus data KTP berdasarkan id.

Response Success

{
  "message": "Data KTP berhasil dihapus",
  "data": null
}
