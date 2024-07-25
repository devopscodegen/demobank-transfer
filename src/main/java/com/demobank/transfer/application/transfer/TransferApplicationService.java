package com.demobank.transfer.application.transfer;

import org.jmolecules.architecture.hexagonal.Application;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demobank.transfer.domain.model.account.AccountId;
import com.demobank.transfer.domain.model.currency.CurrencyCode;
import com.demobank.transfer.domain.model.money.Money;
import com.demobank.transfer.domain.model.transfer.Transfer;
import com.demobank.transfer.domain.model.transfer.TransferRepository;
import com.demobank.transfer.domain.model.transfer.TransferService;

@Service
@Application
public class TransferApplicationService {

    @Autowired
    private TransferService transferService;

    @Autowired
    private TransferRepository transferRepository;

    public Transfer transferAmountBetweenAccounts(TransferAmountBetweenAccountsCommand aCommand) {
        AccountId fromAccountId = new AccountId(aCommand.getFromAccountId());
        AccountId toAccountId = new AccountId(aCommand.getToAccountId());
        CurrencyCode currencyCode = CurrencyCode.valueOf(aCommand.getCurrencyCode());
        Money amount = new Money(
            aCommand.getAmount(),
            currencyCode
        );      
        Transfer transfer = this.transferService.transferAmountBetweenAccounts(
            fromAccountId,
            toAccountId,
            amount);
        return transferRepository.save(transfer);
    }
}
