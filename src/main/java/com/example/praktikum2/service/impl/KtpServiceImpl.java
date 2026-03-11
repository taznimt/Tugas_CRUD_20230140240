package com.example.praktikum2.service.impl;

import com.example.ktp.dto.KtpRequestDto;
import com.example.ktp.dto.KtpResponseDto;
import com.example.ktp.entity.Ktp;
import com.example.ktp.exception.ResourceNotFoundException;
import com.example.ktp.mapper.KtpMapper;
import com.example.ktp.repository.KtpRepository;
import com.example.ktp.service.KtpService;
import com.example.ktp.util.ValidationUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class KtpServiceImpl implements KtpService {

    private final KtpRepository ktpRepository;
    private final KtpMapper ktpMapper;
    private final ValidationUtil validationUtil;

    @Override
    public KtpResponseDto create(KtpRequestDto dto) {
        validationUtil.validateUniqueNomorKtp(dto.getNomorKtp(), null);
        Ktp saved = ktpRepository.save(ktpMapper.toEntity(dto));
        return ktpMapper.toResponse(saved);
    }

    @Override
    @Transactional(readOnly = true)
    public List<KtpResponseDto> findAll() {
        return ktpRepository.findAll()
                .stream()
                .map(ktpMapper::toResponse)
                .toList();
    }

    @Override
    @Transactional(readOnly = true)
    public KtpResponseDto findById(Integer id) {
        return ktpMapper.toResponse(findKtpById(id));
    }

    @Override
    public KtpResponseDto update(Integer id, KtpRequestDto dto) {
        Ktp existing = findKtpById(id);
        validationUtil.validateUniqueNomorKtp(dto.getNomorKtp(), id);
        ktpMapper.updateEntity(existing, dto);
        Ktp updated = ktpRepository.save(existing);
        return ktpMapper.toResponse(updated);
    }

    @Override
    public void delete(Integer id) {
        Ktp existing = findKtpById(id);
        ktpRepository.delete(existing);
    }

    private Ktp findKtpById(Integer id) {
        return ktpRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Data KTP dengan id " + id + " tidak ditemukan"));
    }
}
