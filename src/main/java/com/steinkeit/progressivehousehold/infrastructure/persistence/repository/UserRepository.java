package com.steinkeit.progressivehousehold.infrastructure.persistence.repository;

import com.steinkeit.progressivehousehold.infrastructure.persistence.dto.UserDTO;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<UserDTO, Long> {
}
