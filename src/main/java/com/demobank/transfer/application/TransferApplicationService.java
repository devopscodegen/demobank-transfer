package com.demobank.transfer.application;

import org.springframework.stereotype.Service;

@Service
public class TransferApplicationService {

    public String transfer(TransferCommand aCommand) {
        return "ok";
    }
}
