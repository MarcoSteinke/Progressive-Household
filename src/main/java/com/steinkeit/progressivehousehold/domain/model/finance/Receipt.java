package com.steinkeit.progressivehousehold.domain.model.finance;

public final class Receipt {

    private final ReceiptId id;
    private final Title title;
    private final Amount amount;

    public Receipt(ReceiptId id, Title title, Amount amount) {
        this.id = id;
        this.title = title;
        this.amount = amount;
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
}
