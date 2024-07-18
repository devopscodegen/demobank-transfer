package com.demobank.transfer.domain.model.transfer;

import java.util.UUID;

import org.springframework.data.repository.CrudRepository;

public interface TransferRepository extends CrudRepository<Transfer, UUID>{
    
}