package com.demobank.transfer.application.transfer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demobank.transfer.domain.model.account.AccountService;
import com.demobank.transfer.domain.model.transaction.Transaction;
import com.demobank.transfer.domain.model.transfer.Transfer;
import com.demobank.transfer.domain.model.transfer.TransferIdService;
import com.demobank.transfer.domain.model.transfer.TransferRepository;
import com.demobank.transfer.domain.model.transfer.TransferStatus;


@Service
public class TransferApplicationService {

    @Autowired
    private AccountService accountService;

    @Autowired
    private TransferRepository transferRepository;

    @Autowired
    private TransferIdService transferIdService;

    public Transfer transfer(TransferCommand aCommand) {
        Transaction withdrawTransaction = this.accountService.withdraw(
            aCommand.getFromAccountId(), 
            aCommand.getAmount(),
            aCommand.getCurrency());
        Transaction depositTransaction = this.accountService.deposit(
            aCommand.getToAccountId(), 
            aCommand.getAmount(),
            aCommand.getCurrency());            
        return transferRepository.save(new Transfer(
            transferIdService.nextIdentity(),
            aCommand.getFromAccountId(),
            aCommand.getToAccountId(),
            aCommand.getAmount(),
            aCommand.getCurrency(),
            TransferStatus.SUCCESS,
            withdrawTransaction.getTransactionId(),
            depositTransaction.getTransactionId(),
            withdrawTransaction.getNewBalance(),
            withdrawTransaction.getNewBalanceCurrency(),
            depositTransaction.getNewBalance(),
            depositTransaction.getNewBalanceCurrency()
        ));
    }
}
