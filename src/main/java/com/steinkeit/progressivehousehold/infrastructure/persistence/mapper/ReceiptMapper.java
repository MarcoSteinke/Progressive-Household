package com.steinkeit.progressivehousehold.infrastructure.persistence.mapper;

import com.steinkeit.progressivehousehold.domain.model.finance.Receipt;
import com.steinkeit.progressivehousehold.domain.model.finance.ReceiptFactory;
import com.steinkeit.progressivehousehold.domain.model.finance.ReceiptId;
import com.steinkeit.progressivehousehold.infrastructure.persistence.dto.ReceiptDTO;

public class ReceiptMapper {

    public static ReceiptDTO receiptToReceiptDto(Receipt receipt) {
        return new ReceiptDTO(
                receipt.getId().valueOf(),
                receipt.getTitle().valueOf(),
                receipt.getAmount().valueOf(),
                receipt.getLocalDate(),
                receipt.getUploadedImage().valueOf()
        );
    }

    public static Receipt receiptDtoToReceipt(ReceiptDTO receiptDTO) {
        return ReceiptFactory.create(
                receiptDTO.id(),
                receiptDTO.title(),
                receiptDTO.amount(),
                receiptDTO.localDate(),
                receiptDTO.filePath()
        );
    }
}
