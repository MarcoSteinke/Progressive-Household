package com.steinkeit.progressivehousehold.infrastructure.persistence.implementation;

import com.steinkeit.progressivehousehold.domain.model.finance.Receipt;
import com.steinkeit.progressivehousehold.domain.model.finance.ReceiptFactory;
import com.steinkeit.progressivehousehold.domain.repositoryabstraction.IReceiptRepository;
import com.steinkeit.progressivehousehold.infrastructure.persistence.dto.ReceiptDTO;
import com.steinkeit.progressivehousehold.infrastructure.persistence.mapper.ReceiptMapper;
import com.steinkeit.progressivehousehold.infrastructure.persistence.repository.ReceiptRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class ReceiptRepositoryImpl implements IReceiptRepository {

    private final ReceiptRepository receiptRepository;

    public ReceiptRepositoryImpl(@Lazy ReceiptRepository receiptRepository) {
        this.receiptRepository = receiptRepository;
    }

    @Override
    public Receipt findById(Long id) {
        Optional<ReceiptDTO> optionalReceiptDTO = this.receiptRepository.findById(id);
        return optionalReceiptDTO.map(ReceiptMapper::receiptDtoToReceipt).orElseGet(() -> ReceiptFactory.create(-1L, "", -1.0, null, ""));
    }

    @Override
    public void save(Receipt receipt) {
        ReceiptDTO receiptDTO = ReceiptMapper.receiptToReceiptDto(receipt);
        this.receiptRepository.save(receiptDTO);
    }
}
