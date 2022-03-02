package com.steinkeit.progressivehousehold.mapper.receipt;

import com.steinkeit.progressivehousehold.domain.model.finance.Receipt;
import com.steinkeit.progressivehousehold.domain.model.finance.ReceiptFactory;
import com.steinkeit.progressivehousehold.infrastructure.persistence.dto.ReceiptDTO;
import com.steinkeit.progressivehousehold.infrastructure.persistence.mapper.ReceiptMapper;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.assertj.core.api.Assertions.assertThat;

public class ReceiptMapperTest {

    @Test
    void testReceiptToReceiptDto() {
        //arrange
        LocalDate now = LocalDate.now();
        Receipt receipt = ReceiptFactory.create(1L, "Foo", 1.0, now, null);

        // act
        ReceiptDTO receiptDTO = ReceiptMapper.receiptToReceiptDto(receipt);

        assertThat(receiptDTO.id().equals(receipt.getId().valueOf()));
        assertThat(receiptDTO.title().equals(receipt.getTitle().valueOf()));
        assertThat(receiptDTO.amount().equals(receipt.getAmount().valueOf()));
        assertThat(receiptDTO.localDate().equals(receipt.getLocalDate()));
        assertThat(receiptDTO.filePath().equals(receipt.getUploadedImage().valueOf()));
    }

    @Test
    void testReceiptDtoToReceipt() {
        // arrange
        LocalDate now = LocalDate.now();
        ReceiptDTO receiptDTO = new ReceiptDTO(1L, "Foo", 1.0, now, "");

        // act
        Receipt receipt = ReceiptMapper.receiptDtoToReceipt(receiptDTO);

        // assert
        assertThat(receiptDTO.id().equals(receipt.getId().valueOf()));
        assertThat(receiptDTO.title().equals(receipt.getTitle().valueOf()));
        assertThat(receiptDTO.amount().equals(receipt.getAmount().valueOf()));
        assertThat(receiptDTO.localDate().equals(receipt.getLocalDate()));
        assertThat(receiptDTO.filePath().equals(receipt.getUploadedImage().valueOf()));
    }


}
