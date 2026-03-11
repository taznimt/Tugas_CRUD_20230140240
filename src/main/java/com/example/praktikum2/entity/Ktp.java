package com.example.praktikum2.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Table(name = "ktp")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Ktp {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "nomorKtp", nullable = false, unique = true, length = 16)
    private String nomorKtp;

    @Column(name = "namaLengkap", nullable = false, length = 150)
    private String namaLengkap;

    @Column(name = "alamat", nullable = false, length = 255)
    private String alamat;

    @Column(name = "tanggalLahir", nullable = false)
    private LocalDate tanggalLahir;

    @Column(name = "jenisKelamin", nullable = false, length = 20)
    private String jenisKelamin;
}
