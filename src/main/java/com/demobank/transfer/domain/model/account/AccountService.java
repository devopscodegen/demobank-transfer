package com.demobank.transfer.domain.model.account;

import com.demobank.transfer.domain.model.account.transaction.Transaction;
import com.demobank.transfer.domain.model.money.Money;

public interface AccountService {
	public Transaction withdrawAmountFromAccount(AccountId accountId, Money amount);

    public Transaction depositAmountToAccount(AccountId accountId, Money amount);
}
