package com.demobank.transfer.port.adapter.controller.transfer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demobank.transfer.application.transfer.TransferApplicationService;
import com.demobank.transfer.application.transfer.TransferCommand;
import com.demobank.transfer.domain.model.transfer.Transfer;

@RestController
@RequestMapping("/api/v1/transfer")
public class TransferController {
    @Autowired
    private TransferApplicationService transferApplicationService;

    @PostMapping
    public TransferResponse transfer(@RequestBody TransferRequest request) {
        Transfer transfer = this.transferApplicationService.transfer(
                new TransferCommand(
                    request.getFromAccountId(), 
                    request.getToAccountId(), 
                    request.getAmount(), 
                    request.getCurrency()));
        return new TransferResponse(
            transfer.getTransferStatus().toString(),
            transfer.getTransferId(),
            transfer.getWithdrawTransactionId(),
            transfer.getDepositTransactionId(),
            transfer.getFromAccountNewBalance(),
            transfer.getFromAccountNewBalanceCurrency(),
            transfer.getToAccountNewBalance(),
            transfer.getToAccountNewBalanceCurrency()

        );
    }
}