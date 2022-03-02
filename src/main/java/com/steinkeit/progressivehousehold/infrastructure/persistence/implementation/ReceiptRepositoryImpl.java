package com.steinkeit.progressivehousehold.infrastructure.persistence.implementation;

import com.steinkeit.progressivehousehold.domain.model.finance.Receipt;
import com.steinkeit.progressivehousehold.domain.model.finance.ReceiptFactory;
import com.steinkeit.progressivehousehold.infrastructure.persistence.dto.ReceiptDTO;
import com.steinkeit.progressivehousehold.infrastructure.persistence.mapper.ReceiptMapper;
import com.steinkeit.progressivehousehold.infrastructure.persistence.repository.ReceiptRepository;

import java.util.Optional;

public class ReceiptRepositoryImpl {

    private final ReceiptRepository receiptRepository;

    public ReceiptRepositoryImpl(ReceiptRepository receiptRepository) {
        this.receiptRepository = receiptRepository;
    }

    public Receipt findById(Long id) {
        Optional<ReceiptDTO> optionalReceiptDTO = this.receiptRepository.findById(id);
        return optionalReceiptDTO.map(ReceiptMapper::receiptDtoToReceipt).orElseGet(() -> ReceiptFactory.create(-1L, "", -1.0, null, ""));
    }

    public void save(Receipt receipt) {
        ReceiptDTO receiptDTO = ReceiptMapper.receiptToReceiptDto(receipt);
        this.receiptRepository.save(receiptDTO);
    }
}
