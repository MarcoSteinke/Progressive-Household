package com.steinkeit.progressivehousehold.domain.model.finance;

import java.time.LocalDate;

public class ReceiptFactory {

    public static Receipt create(String title, Double amount, LocalDate localDate) {
        return new Receipt(
                null,
                new Title(title),
                new Amount(amount),
                localDate,
                null
        );
    }
}
