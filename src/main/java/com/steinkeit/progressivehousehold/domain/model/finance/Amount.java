package com.steinkeit.progressivehousehold.domain.model.finance;

public final class Amount {

    private final Double amount;

    private Amount(Double amount) {
        this.amount = amount;
    }

    public static Amount create(Double amount) {
        if(amount != null && amount >= 0) {
            return new Amount(amount);
        } else return new Amount(-1.0);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Amount amount1 = (Amount) o;

        return amount.equals(amount1.amount);
    }

    public Boolean isValid() {
        return !this.equals(new Amount(-1.0));
    }

    @Override
    public int hashCode() {
        return amount.hashCode();
    }

    public Double valueOf() {
        return amount;
    }
}
