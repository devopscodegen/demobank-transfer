package com.demobank.transfer.domain.model.transfer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demobank.transfer.domain.model.account.AccountId;
import com.demobank.transfer.domain.model.account.AccountService;
import com.demobank.transfer.domain.model.account.transaction.Transaction;
import com.demobank.transfer.domain.model.money.Money;

@Service
@org.jmolecules.ddd.annotation.Service
public class TransferService {

    @Autowired
    private AccountService accountService;

    public Transfer transferAmountBetweenAccounts(AccountId fromAccountId, AccountId toAccountId, Money amount) {
        Transaction debitTransaction = this.accountService.debitAmountFromAccount(
            fromAccountId,
            amount
        );
        Transaction creditTransaction = this.accountService.creditAmountToAccount(
            toAccountId,
            amount
        );          
        return new Transfer(
            new TransferId(),
            fromAccountId,
            toAccountId,
            amount,
            TransferStatus.SUCCESS,
            debitTransaction.getTransactionId(),
            creditTransaction.getTransactionId(),
            debitTransaction.getNewBalance(),
            creditTransaction.getNewBalance()
        );
    }
}
