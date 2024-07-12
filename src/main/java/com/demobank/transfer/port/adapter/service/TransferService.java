package com.demobank.transfer.port.adapter.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demobank.transfer.application.TransferApplicationService;
import com.demobank.transfer.application.TransferCommand;
import com.demobank.transfer.port.adapter.controller.TransferResponse;

@Service
public class TransferService {
    @Autowired
    private TransferApplicationService transferApplicationService;

    public TransferResponse transfer(String fromAccountId, String toAccountId, double amount, String currency) {
        return new TransferResponse(
                transferApplicationService.transfer(new TransferCommand(fromAccountId, toAccountId, amount, currency)));
    }
}