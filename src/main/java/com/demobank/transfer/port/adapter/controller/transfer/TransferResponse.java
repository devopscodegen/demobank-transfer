package com.demobank.transfer.port.adapter.controller.transfer;

public class TransferResponse {
    private String transferStatus;
    private String withdrawTransactionId;
    private String depositTransactionId;
    private double fromAccountNewBalance;
    private String fromAccountNewBalanceCurrency;
    private double toAccountNewBalance;
    private String toAccountNewBalanceCurrency;
    public String getTransferStatus() {
        return transferStatus;
    }
    public void setTransferStatus(String transferStatus) {
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
    public TransferResponse(
            String transferStatus, String withdrawTransactionId, String depositTransactionId,
            double fromAccountNewBalance, String fromAccountNewBalanceCurrency, double toAccountNewBalance,
            String toAccountNewBalanceCurrency) {
        this.setTransferStatus(transferStatus);
        this.setWithdrawTransactionId(withdrawTransactionId);
        this.setDepositTransactionId(depositTransactionId);
        this.setFromAccountNewBalance(fromAccountNewBalance);
        this.setFromAccountNewBalanceCurrency(fromAccountNewBalanceCurrency);
        this.setToAccountNewBalance(toAccountNewBalance);
        this.setToAccountNewBalanceCurrency(toAccountNewBalanceCurrency);
    }
}

