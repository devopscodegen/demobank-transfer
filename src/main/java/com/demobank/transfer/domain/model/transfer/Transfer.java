package com.demobank.transfer.domain.model.transfer;

public class Transfer {
    private String fromAccountId;
    private String toAccountId;
    private Double amount;
    private String currency;
    private TransferStatus transferStatus;
    private String withdrawTransactionId;
    private String depositTransactionId;
    private double fromAccountNewBalance;
    private String fromAccountNewBalanceCurrency;
    private double toAccountNewBalance;
    private String toAccountNewBalanceCurrency;
    public String getFromAccountId() {
        return fromAccountId;
    }
    public void setFromAccountId(String fromAccountId) {
        this.fromAccountId = fromAccountId;
    }
    public String getToAccountId() {
        return toAccountId;
    }
    public void setToAccountId(String toAccountId) {
        this.toAccountId = toAccountId;
    }
    public Double getAmount() {
        return amount;
    }
    public void setAmount(Double amount) {
        this.amount = amount;
    }
    public String getCurrency() {
        return currency;
    }
    public void setCurrency(String currency) {
        this.currency = currency;
    }
    public TransferStatus getTransferStatus() {
        return transferStatus;
    }
    public void setTransferStatus(TransferStatus transferStatus) {
        this.transferStatus = transferStatus;
    }
    public String getWithdrawTransactionId() {
        return withdrawTransactionId;
    }
    public void setWithdrawTransactionId(String withdrawTransactionId) {
        this.withdrawTransactionId = withdrawTransactionId;
    }
    public String getDepositTransactionId() {
        return depositTransactionId;
    }
    public void setDepositTransactionId(String depositTransactionId) {
        this.depositTransactionId = depositTransactionId;
    }
    public double getFromAccountNewBalance() {
        return fromAccountNewBalance;
    }
    public void setFromAccountNewBalance(double fromAccountNewBalance) {
        this.fromAccountNewBalance = fromAccountNewBalance;
    }
    public String getFromAccountNewBalanceCurrency() {
        return fromAccountNewBalanceCurrency;
    }
    public void setFromAccountNewBalanceCurrency(String fromAccountNewBalanceCurrency) {
        this.fromAccountNewBalanceCurrency = fromAccountNewBalanceCurrency;
    }
    public double getToAccountNewBalance() {
        return toAccountNewBalance;
    }
    public void setToAccountNewBalance(double toAccountNewBalance) {
        this.toAccountNewBalance = toAccountNewBalance;
    }
    public String getToAccountNewBalanceCurrency() {
        return toAccountNewBalanceCurrency;
    }
    public void setToAccountNewBalanceCurrency(String toAccountNewBalanceCurrency) {
        this.toAccountNewBalanceCurrency = toAccountNewBalanceCurrency;
    }
    public Transfer(String fromAccountId, String toAccountId, Double amount, String currency,
            TransferStatus transferStatus, String withdrawTransactionId, String depositTransactionId,
            double fromAccountNewBalance, String fromAccountNewBalanceCurrency, double toAccountNewBalance,
            String toAccountNewBalanceCurrency) {
        this.setFromAccountId(fromAccountId);
        this.setToAccountId(toAccountId);
        this.setAmount(amount);
        this.setCurrency(currency);
        this.setTransferStatus(transferStatus);
        this.setWithdrawTransactionId(withdrawTransactionId);
        this.setDepositTransactionId(depositTransactionId);
        this.setFromAccountNewBalance(fromAccountNewBalance);
        this.setFromAccountNewBalanceCurrency(fromAccountNewBalanceCurrency);
        this.setToAccountNewBalance(toAccountNewBalance);
        this.setToAccountNewBalanceCurrency(toAccountNewBalanceCurrency);
    }
}

