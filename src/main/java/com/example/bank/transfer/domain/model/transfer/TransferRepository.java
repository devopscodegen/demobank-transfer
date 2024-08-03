package com.example.bank.transfer.domain.model.transfer;

import org.jmolecules.ddd.annotation.Repository;

import com.example.bank.transfer.domain.model.common.BaseRepository;

@Repository
public interface TransferRepository extends BaseRepository<Transfer, TransferId>{
    
}