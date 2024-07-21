package com.demobank.transfer.domain.model.transfer;

import org.jmolecules.ddd.annotation.Repository;

import com.demobank.transfer.domain.model.common.BaseRepository;

@Repository
public interface TransferRepository extends BaseRepository<Transfer, TransferId>{
    
}