package com.steinkeit.progressivehousehold.domain.model.finance;

final class Amount {

    private final Double amount;

    Amount(Double amount) {
        this.amount = amount;
    }

    public Double getAmount() {
        return amount;
    }
}
