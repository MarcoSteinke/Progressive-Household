package com.steinkeit.progressivehousehold.infrastructure.persistence.dto;

import org.springframework.data.annotation.Id;

import java.time.LocalDate;

public class ReceiptDTO {

    private Long id;
    private String title;
    private Double amount;
    private LocalDate localDate;
    private String filePath;

    public ReceiptDTO(Long id, String title, Double amount, LocalDate localDate, String filePath) {
        this.id = id;
        this.title = title;
        this.amount = amount;
        this.localDate = localDate;
        this.filePath = filePath;
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Double getAmount() {
        return amount;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public String getFilePath() {
        return filePath;
    }
}
