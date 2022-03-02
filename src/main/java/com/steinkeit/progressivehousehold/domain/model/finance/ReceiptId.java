package com.steinkeit.progressivehousehold.domain.model.finance;

public final class ReceiptId {

    private final Long id;

    private ReceiptId(Long id) {
        this.id = id;
    }

    public static ReceiptId create(Long id) {
        if(id != null) {
            return new ReceiptId(id);
        } else return new ReceiptId(-1L);
    }

    public Boolean isValid() {
        return !this.equals(new ReceiptId(-1L));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ReceiptId receiptId = (ReceiptId) o;

        return id.equals(receiptId.id);
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }

    public Long valueOf() {
        return id;
    }
}
