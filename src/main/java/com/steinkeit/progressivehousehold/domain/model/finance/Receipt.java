package com.steinkeit.progressivehousehold.domain.model.finance;

import java.time.LocalDate;

public final class Receipt {

    private final ReceiptId id;
    private final Title title;
    private final Amount amount;
    private final LocalDate localDate;
    private final UploadedImage uploadedImage;

    public Receipt(ReceiptId id, Title title, Amount amount, LocalDate localDate, UploadedImage uploadedImage) {
        this.id = id;
        this.title = title;
        this.amount = amount;
        this.localDate = localDate;
        this.uploadedImage = uploadedImage;
    }

    public Title getTitle() {
        return title;
    }

    public Amount getAmount() {
        return amount;
    }

    public ReceiptId getId() {
        return id;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public UploadedImage getUploadedImage() {
        return uploadedImage;
    }
}
