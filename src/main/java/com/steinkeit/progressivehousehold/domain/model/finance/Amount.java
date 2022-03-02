package com.steinkeit.progressivehousehold.domain.model.finance;

final class Amount {

    private final Float amount;

    Amount(Float amount) {
        this.amount = amount;
    }

    public Float getAmount() {
        return amount;
    }
}
