package com.demobank.transfer.port.adapter.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demobank.transfer.application.TransferApplicationService;
import com.demobank.transfer.application.TransferCommand;

@RestController
@RequestMapping("/transfer")
public class TransferController {
    @Autowired
    private TransferApplicationService transferApplicationService;

    @PostMapping
    public TransferResponse transfer(@RequestBody TransferRequest request) {
        return new TransferResponse(transferApplicationService.transfer(new TransferCommand(request.getFromAccountId(), request.getToAccountId(), request.getAmount(), request.getCurrency())));
    }
}