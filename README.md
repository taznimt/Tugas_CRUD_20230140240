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


|Halaman Utama|<img width="1917" height="1010" alt="image" src="https://github.com/user-attachments/assets/321f6c4a-fab9-4653-b86c-613d52262497" />|
|Tambah Data|<img width="1918" height="621" alt="image" src="https://github.com/user-attachments/assets/438ccf43-6d1c-47c2-be1c-78b92a0f629e" />|
|Berhasil Menambah Data|<img width="1917" height="1007" alt="image" src="https://github.com/user-attachments/assets/817f67bb-7d32-4157-9d16-a296cc960893" />|
|terjadi error karena data sudah ada|<img width="1919" height="1009" alt="image" src="https://github.com/user-attachments/assets/ef45eef0-c0a8-460b-b95d-5862721ba68b" />|
|Edit data|<img width="1895" height="819" alt="image" src="https://github.com/user-attachments/assets/b47254ac-a176-4a9f-8522-1aae04fbc9ca" />|
|Berhasil edit data|<img width="1909" height="1003" alt="image" src="https://github.com/user-attachments/assets/35704b49-1cc1-4195-be77-c1d9113b6edc" />|
|hapus data|<img width="1916" height="1002" alt="image" src="https://github.com/user-attachments/assets/00057dbd-457b-4d92-9b6e-57a2e56b0e09" />|
|berhasil hapus data|<img width="1917" height="1002" alt="image" src="https://github.com/user-attachments/assets/20b7ca69-5870-445f-b5b7-0860764bb8c8" />|
|Jenis kelamin drowdown|<img width="1909" height="1002" alt="image" src="https://github.com/user-attachments/assets/b048eeee-2b34-407f-9a32-0357f37a7d76" />|
|format date|<img width="429" height="514" alt="image" src="https://github.com/user-attachments/assets/fe652e74-430b-48b4-8126-637e6f2b9ab1" />|








