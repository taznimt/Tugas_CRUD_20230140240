package com.example.praktikum2.dto;

import jakarta.validation.constraints.*;
import lombok.Data;

import java.time.LocalDate;

@Data
public class KtpRequestDto {

    @NotBlank(message = "Nomor KTP wajib diisi")
    @Pattern(regexp = "^[0-9]{16}$", message = "Nomor KTP harus 16 digit angka")
    private String nomorKtp;

    @NotBlank(message = "Nama lengkap wajib diisi")
    @Size(max = 150, message = "Nama lengkap maksimal 150 karakter")
    private String namaLengkap;

    @NotBlank(message = "Alamat wajib diisi")
    @Size(max = 255, message = "Alamat maksimal 255 karakter")
    private String alamat;

    @NotNull(message = "Tanggal lahir wajib diisi")
    @Past(message = "Tanggal lahir harus tanggal lampau")
    private LocalDate tanggalLahir;

    @NotBlank(message = "Jenis kelamin wajib diisi")
    @Pattern(regexp = "^(Laki-laki|Perempuan)$", message = "Jenis kelamin harus Laki-laki atau Perempuan")
    private String jenisKelamin;
}
