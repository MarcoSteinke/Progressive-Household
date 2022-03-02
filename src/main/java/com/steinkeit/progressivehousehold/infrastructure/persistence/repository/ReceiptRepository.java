package com.steinkeit.progressivehousehold.infrastructure.persistence.repository;

import com.steinkeit.progressivehousehold.infrastructure.persistence.dto.ReceiptDTO;
import org.springframework.data.repository.CrudRepository;

public interface ReceiptRepository extends CrudRepository<ReceiptDTO, Long> {
}
