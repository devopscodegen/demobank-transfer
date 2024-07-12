package com.demobank.transfer.port.adapter.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demobank.transfer.port.adapter.service.TransferService;

@RestController
@RequestMapping("/transfer")
public class TransferController {
    @Autowired
    private TransferService transferService;

    @PostMapping
    public TransferResponse transfer(@RequestBody TransferRequest request) {
        return transferService.transfer(request.getFromAccountId(), request.getToAccountId(), request.getAmount(), request.getCurrency());
    }
}