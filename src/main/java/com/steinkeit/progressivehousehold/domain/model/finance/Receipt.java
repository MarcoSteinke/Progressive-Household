package com.steinkeit.progressivehousehold.domain.model.finance;

import java.time.LocalDate;
import java.util.Objects;

public final class Receipt {

    private final ReceiptId id;
    private final Title title;
    private final Amount amount;
    private final LocalDate localDate;
    private final UploadedImage uploadedImage;

    Receipt(ReceiptId id, Title title, Amount amount, LocalDate localDate, UploadedImage uploadedImage) {
        this.id = id;
        this.title = title;
        this.amount = amount;
        this.localDate = localDate;
        this.uploadedImage = uploadedImage;
    }

    public static Receipt error() {
        return ReceiptFactory.create(-1L, "", -1.0, null, "");
    }

    public Boolean hasSomeError() {
        return this.id.equals(ReceiptId.create(-1L));
    }

    public Title getTitle() {
        return title;
    }

    public Boolean hasImage() {
        return this.uploadedImage != null;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Receipt receipt = (Receipt) o;

        if (!id.equals(receipt.id)) return false;
        if (!title.equals(receipt.title)) return false;
        if (!amount.equals(receipt.amount)) return false;
        if (!localDate.equals(receipt.localDate)) return false;
        return Objects.equals(uploadedImage, receipt.uploadedImage);
    }

    @Override
    public int hashCode() {
        int result = id.hashCode();
        result = 31 * result + title.hashCode();
        result = 31 * result + amount.hashCode();
        result = 31 * result + localDate.hashCode();
        result = 31 * result + (uploadedImage != null ? uploadedImage.hashCode() : 0);
        return result;
    }
}
