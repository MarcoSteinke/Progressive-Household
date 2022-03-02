package com.steinkeit.progressivehousehold.infrastructure.persistence.dto;

import java.time.LocalDate;

public record ReceiptDTO(
        Long id,
        String title,
        Double amount,
        LocalDate localDate,
        String filePath
) {}
