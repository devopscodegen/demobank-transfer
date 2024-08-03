package com.example.bank.transfer.port.adapter.controller.transfer;

import org.jmolecules.architecture.hexagonal.Adapter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.bank.transfer.application.transfer.TransferApplicationService;
import com.example.bank.transfer.application.transfer.TransferAmountBetweenAccountsCommand;
import com.example.bank.transfer.domain.model.transfer.Transfer;

@RestController
@RequestMapping("/api/v1/transfer")
@Adapter
public class TransferController {
    @Autowired
    private TransferApplicationService transferApplicationService;

    @PostMapping("/amount_between_accounts")
    public TransferAmountBetweenAccountsResponse transferAmountBetweenAccounts(@RequestBody TransferAmountBetweenAccountsRequest request) {
        Transfer transfer = this.transferApplicationService.transferAmountBetweenAccounts(
                new TransferAmountBetweenAccountsCommand(
                    request.getFromAccountId(), 
                    request.getToAccountId(), 
                    request.getAmount(), 
                    request.getCurrencyCode()));
        return new TransferAmountBetweenAccountsResponse(
            transfer.getTransferStatus().toString(),
            transfer.getTransferId().getId(),
            transfer.getDebitTransactionId().getId(),
            transfer.getCreditTransactionId().getId(),
            transfer.getFromAccountNewBalance().getAmount(),
            transfer.getFromAccountNewBalance().getCurrencyCode().toString(),
            transfer.getToAccountNewBalance().getAmount(),
            transfer.getToAccountNewBalance().getCurrencyCode().toString()

        );
    }
}