package com.steinkeit.progressivehousehold.domain.repositoryabstraction;

import com.steinkeit.progressivehousehold.domain.model.finance.Receipt;

public interface IReceiptRepository {
    Receipt findById(Long id);

    void save(Receipt receipt);
}
