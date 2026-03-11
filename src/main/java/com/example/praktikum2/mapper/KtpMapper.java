package com.example.praktikum2.mapper;

import com.example.ktp.dto.KtpRequestDto;
import com.example.ktp.dto.KtpResponseDto;
import com.example.ktp.entity.Ktp;
import org.springframework.stereotype.Component;

@Component
public class KtpMapper {

    public Ktp toEntity(KtpRequestDto dto) {
        return Ktp.builder()
                .nomorKtp(dto.getNomorKtp())
                .namaLengkap(dto.getNamaLengkap())
                .alamat(dto.getAlamat())
                .tanggalLahir(dto.getTanggalLahir())
                .jenisKelamin(dto.getJenisKelamin())
                .build();
    }

    public void updateEntity(Ktp entity, KtpRequestDto dto) {
        entity.setNomorKtp(dto.getNomorKtp());
        entity.setNamaLengkap(dto.getNamaLengkap());
        entity.setAlamat(dto.getAlamat());
        entity.setTanggalLahir(dto.getTanggalLahir());
        entity.setJenisKelamin(dto.getJenisKelamin());
    }

    public KtpResponseDto toResponse(Ktp entity) {
        return KtpResponseDto.builder()
                .id(entity.getId())
                .nomorKtp(entity.getNomorKtp())
                .namaLengkap(entity.getNamaLengkap())
                .alamat(entity.getAlamat())
                .tanggalLahir(entity.getTanggalLahir())
                .jenisKelamin(entity.getJenisKelamin())
                .build();
    }
}
