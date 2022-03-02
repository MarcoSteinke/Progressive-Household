package com.steinkeit.progressivehousehold.domain.service;

import com.steinkeit.progressivehousehold.domain.model.finance.Receipt;
import com.steinkeit.progressivehousehold.domain.model.finance.ReceiptId;
import com.steinkeit.progressivehousehold.domain.repositoryabstraction.IReceiptRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FinanceService {

    private final IReceiptRepository receiptRepository;

    public FinanceService(IReceiptRepository receiptRepository) {
        this.receiptRepository = receiptRepository;
    }

    public void save(Receipt receipt) {
        this.receiptRepository.save(receipt);
    }

    public Receipt loadReceiptById(ReceiptId receiptId) {
        if(receiptId.isValid()) {
            return this.receiptRepository.findById(receiptId.valueOf());
        } else return Receipt.error();
    }
}
