package com.demobank.transfer.domain.model.transfer;

import java.util.UUID;

import org.springframework.stereotype.Service;

@Service
public class TransferIdService {
    public UUID nextIdentity() {
        return UUID.randomUUID();
    }
}
