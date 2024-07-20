package com.demobank.transfer.domain.model.account.transaction;

import com.demobank.transfer.domain.model.account.AccountId;
import com.demobank.transfer.domain.model.money.Money;

public class Transaction {

    private TransactionId transactionId;
    private AccountId accountId;
    private Money amount;
    private TransactionStatus transactionStatus;
    private Money newBalance;

    public Transaction(TransactionId transactionId, AccountId accountId, Money amount, TransactionStatus transactionStatus, Money newBalance) {
        super();

        this.setTransactionId(transactionId);
        this.setAccountId(accountId);
        this.setAmount(amount);
        this.setStatus(transactionStatus);
        this.setNewBalance(newBalance);
    }

    public Transaction() {
        super();
    }

    public TransactionId getTransactionId() {
        return transactionId;
    }

    private void setTransactionId(TransactionId transactionId) {
        this.transactionId = transactionId;
    }

    public AccountId getAccountId() {
        return accountId;
    }

    private void setAccountId(AccountId accountId) {
        this.accountId = accountId;
    }

    public Money getAmount() {
        return amount;
    }

    private void setAmount(Money amount) {
        this.amount = amount;
    }

    public TransactionStatus getStatus() {
        return transactionStatus;
    }

    private void setStatus(TransactionStatus transactionStatus) {
        this.transactionStatus = transactionStatus;
    }

    public Money getNewBalance() {
        return newBalance;
    }

    private void setNewBalance(Money newBalance) {
        this.newBalance = newBalance;
    }
}
