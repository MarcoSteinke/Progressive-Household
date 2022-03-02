package com.steinkeit.progressivehousehold.domain.model.finance;

import java.time.LocalDate;

public class ReceiptFactory {

    public static Receipt create(String title, Double amount, LocalDate localDate) {
        return new Receipt(
                null,
                Title.create(title),
                Amount.create(amount),
                localDate,
                null
        );
    }

    public static Receipt create(Long id, String title, Double amount, LocalDate localDate, String filePath) {
        return new Receipt(
                ReceiptId.create(id),
                Title.create(title),
                Amount.create(amount),
                localDate,
                UploadedImage.create(filePath)
        );
    }
}
