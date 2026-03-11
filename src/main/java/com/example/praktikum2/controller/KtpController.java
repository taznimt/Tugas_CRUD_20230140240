package com.example.praktikum2.controller;

import com.example.ktp.dto.ApiResponse;
import com.example.ktp.dto.KtpRequestDto;
import com.example.ktp.dto.KtpResponseDto;
import com.example.ktp.service.KtpService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ktp")
@RequiredArgsConstructor
@CrossOrigin(origins = "*")
public class KtpController {

    private final KtpService ktpService;

    @PostMapping
    public ResponseEntity<ApiResponse<KtpResponseDto>> create(@Valid @RequestBody KtpRequestDto dto) {
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(ApiResponse.<KtpResponseDto>builder()
                        .message("Data KTP berhasil ditambahkan")
                        .data(ktpService.create(dto))
                        .build());
    }

    @GetMapping
    public ResponseEntity<ApiResponse<List<KtpResponseDto>>> findAll() {
        return ResponseEntity.ok(
                ApiResponse.<List<KtpResponseDto>>builder()
                        .message("Berhasil mengambil seluruh data KTP")
                        .data(ktpService.findAll())
                        .build()
        );
    }

    @GetMapping("/{id}")
    public ResponseEntity<ApiResponse<KtpResponseDto>> findById(@PathVariable Integer id) {
        return ResponseEntity.ok(
                ApiResponse.<KtpResponseDto>builder()
                        .message("Berhasil mengambil data KTP")
                        .data(ktpService.findById(id))
                        .build()
        );
    }

    @PutMapping("/{id}")
    public ResponseEntity<ApiResponse<KtpResponseDto>> update(@PathVariable Integer id,
                                                              @Valid @RequestBody KtpRequestDto dto) {
        return ResponseEntity.ok(
                ApiResponse.<KtpResponseDto>builder()
                        .message("Data KTP berhasil diperbarui")
                        .data(ktpService.update(id, dto))
                        .build()
        );
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<ApiResponse<Void>> delete(@PathVariable Integer id) {
        ktpService.delete(id);
        return ResponseEntity.ok(
                ApiResponse.<Void>builder()
                        .message("Data KTP berhasil dihapus")
                        .build()
        );
    }
}
