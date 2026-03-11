package com.example.praktikum2.service;

import com.example.ktp.dto.KtpRequestDto;
import com.example.ktp.dto.KtpResponseDto;

import java.util.List;

public interface KtpService {
    KtpResponseDto create(KtpRequestDto dto);
    List<KtpResponseDto> findAll();
    KtpResponseDto findById(Integer id);
    KtpResponseDto update(Integer id, KtpRequestDto dto);
    void delete(Integer id);
}
