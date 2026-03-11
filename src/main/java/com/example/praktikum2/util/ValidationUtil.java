package com.example.praktikum2.util;

import com.example.ktp.exception.BadRequestException;
import com.example.ktp.repository.KtpRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class ValidationUtil {

    private final KtpRepository ktpRepository;

    public void validateUniqueNomorKtp(String nomorKtp, Integer currentId) {
        ktpRepository.findByNomorKtp(nomorKtp).ifPresent(data -> {
            if (currentId == null || !data.getId().equals(currentId)) {
                throw new BadRequestException("Nomor KTP sudah terdaftar");
            }
        });
    }
}
