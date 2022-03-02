package com.steinkeit.progressivehousehold.infrastructure.persistence.repository;

import com.steinkeit.progressivehousehold.infrastructure.persistence.dto.ReceiptDTO;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


public interface ReceiptRepository extends CrudRepository<ReceiptDTO, Long> {
}
