package com.demobank.transfer.domain.model.account;

public interface AccountService {
	public Transaction withdraw(String accountId, double amount, String currency);

    public Transaction deposit(String accountId, double amount, String currency);
}
