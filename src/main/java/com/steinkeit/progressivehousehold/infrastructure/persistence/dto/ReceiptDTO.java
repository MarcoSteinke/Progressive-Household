package com.steinkeit.progressivehousehold.infrastructure.persistence.dto;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import java.time.LocalDate;

@Table("receipt_dto")
public class ReceiptDTO {

    @Id
    private final Long id;
    private final String title;
    private final Double amount;
    @Column("local_date")
    private final LocalDate localDate;
    @Column("file_path")
    private final String filePath;

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
