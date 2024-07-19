package com.demobank.transfer.domain.model.account;

import com.demobank.transfer.domain.model.transaction.Transaction;

public interface AccountService {
	public Transaction withdraw(String accountId, Double amount, String currencyCode);

    public Transaction deposit(String accountId, Double amount, String currencyCode);
}
