package com.demobank.transfer.domain.model.transaction;

import java.util.UUID;

public class Transaction {

    private UUID transactionId;
    private String accountId;
    private Double amount;
    private String currencyCode;
    private TransactionStatus transactionStatus;
    private Double newBalance;
    private String newBalanceCurrency;

    public Transaction(UUID transactionId, String accountId, Double amount, String currencyCode, TransactionStatus transactionStatus, Double newBalance, String newBalanceCurrency) {
        super();

        this.setTransactionId(transactionId);
        this.setAccountId(accountId);
        this.setAmount(amount);
        this.setCurrencyCode(currencyCode);
        this.setStatus(transactionStatus);
        this.setNewBalance(newBalance);
        this.setNewBalanceCurrency(newBalanceCurrency);
    }

    public Transaction() {
        super();
    }

    public UUID getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(UUID transactionId) {
        this.transactionId = transactionId;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public TransactionStatus getStatus() {
        return transactionStatus;
    }

    public void setStatus(TransactionStatus transactionStatus) {
        this.transactionStatus = transactionStatus;
    }

    public Double getNewBalance() {
        return newBalance;
    }

    public void setNewBalance(Double newBalance) {
        this.newBalance = newBalance;
    }

    public String getNewBalanceCurrency() {
        return newBalanceCurrency;
    }

    public void setNewBalanceCurrency(String newBalanceCurrency) {
        this.newBalanceCurrency = newBalanceCurrency;
    }
}
