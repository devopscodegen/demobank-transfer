package com.example.bank.transfer.domain.model.account;

import org.jmolecules.architecture.hexagonal.Port;
import org.jmolecules.ddd.annotation.Service;

import com.example.bank.transfer.domain.model.account.transaction.Transaction;
import com.example.bank.transfer.domain.model.money.Money;

@Service
@Port
public interface AccountService {
	public Transaction debitAmountFromAccount(AccountId accountId, Money amount);

    public Transaction creditAmountToAccount(AccountId accountId, Money amount);
}
