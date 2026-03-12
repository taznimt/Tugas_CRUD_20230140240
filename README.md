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

Response Success

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
2. GET /ktp

Digunakan untuk mengambil seluruh data KTP.

Response Success

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
3. GET /ktp/{id}

Digunakan untuk mengambil data KTP berdasarkan id.

Response Success

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

Response Failed

{
  "message": "Data KTP dengan id 99 tidak ditemukan"
}
4. PUT /ktp/{id}

Digunakan untuk memperbarui data KTP berdasarkan id.

Request Body

{
  "nomorKtp": "3276010101010001",
  "namaLengkap": "Zhang linghe",
  "alamat": "Jl. Melati No. 20",
  "tanggalLahir": "2001-06-15",
  "jenisKelamin": "Laki-laki"
}

Response Success

{
  "message": "Data KTP berhasil diperbarui",
  "data": {
    "id": 1,
    "nomorKtp": "3276010101010001",
    "namaLengkap": "Zhang linghe",
    "alamat": "Jl. Melati No. 20",
    "tanggalLahir": "2001-06-15",
    "jenisKelamin": "Laki-laki"
  }
}
5. DELETE /ktp/{id}

Digunakan untuk menghapus data KTP berdasarkan id.

Response Success

{
  "message": "Data KTP berhasil dihapus",
  "data": null
}

## screenshoot

### Halaman Utama
![Halaman Utama](screenshoot/img.png)
![Data berhasil di tambahkan](screenshoot/img_2.png)
![Tambah Data](screenshoot/img_1.png)
![Edit data](screenshoot/img_3.png)
![Data berhasil di edit](screenshoot/img_4.png)
![Hapus Data](screenshoot/img_5.png)
![Data berhasil di hapus](screenshoot/img_6.png)
![Format date](screenshoot/img_7.png)
![Drowdown jenis kelamin](screenshoot/img_8.png)
![No Ktp wajib diisi](screenshoot/img_9.png)
![No ktp harus 16 digit](screenshoot/img_10.png)
![No ktp sudah ada](screenshoot/img_11.png)
![Nama lengkap wajib di isi](screenshoot/img_12.png)
![Alamat wajib diisi](screenshoot/img_13.png)
![Jenis Kelamin wajib diisi](screenshoot/img_14.png)
![Database](screenshoot/img_15.png)
![Database1](screenshoot/img_16.png)


