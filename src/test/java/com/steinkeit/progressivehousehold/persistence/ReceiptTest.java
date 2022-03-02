package com.steinkeit.progressivehousehold.persistence;

import com.steinkeit.progressivehousehold.domain.model.finance.Receipt;
import com.steinkeit.progressivehousehold.domain.model.finance.ReceiptFactory;
import com.steinkeit.progressivehousehold.domain.repositoryabstraction.IReceiptRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;

import static org.assertj.core.api.Assertions.assertThat;


@SpringBootTest
public class ReceiptTest {

    private IReceiptRepository receiptRepository;

    @Autowired
    public ReceiptTest(IReceiptRepository receiptRepository) {
        this.receiptRepository = receiptRepository;
    }

    @Test
    void persistingAReceiptIsWorking() {
        // arrange
        LocalDate now = LocalDate.now();
        Long id = 1L;
        Receipt receipt = ReceiptFactory.create(id, "Title", 1.0, now, null);

        // act
        this.receiptRepository.save(receipt);
        Receipt loadedReceipt = this.receiptRepository.findById(id);

        // assert
        assertThat(loadedReceipt).isEqualTo(receipt);
    }
}
