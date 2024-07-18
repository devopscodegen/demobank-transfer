package com.demobank.transfer.port.adapter.controller.transfer;

import java.util.UUID;

public class TransferResponse {
    private String transferStatus;
    private UUID transferId;
    private UUID withdrawTransactionId;
    private UUID depositTransactionId;
    private Double fromAccountNewBalance;
    private String fromAccountNewBalanceCurrency;
    private Double toAccountNewBalance;
    private String toAccountNewBalanceCurrency;
    public String getTransferStatus() {
        return transferStatus;
    }
    public void setTransferStatus(String transferStatus) {
        this.transferStatus = transferStatus;
    }
    public UUID getTransferId() {
        return transferId;
    }
    public void setTransferId(UUID transferId) {
        this.transferId = transferId;
    }
    public UUID getWithdrawTransactionId() {
        return withdrawTransactionId;
    }
    public void setWithdrawTransactionId(UUID withdrawTransactionId) {
        this.withdrawTransactionId = withdrawTransactionId;
    }
    public UUID getDepositTransactionId() {
        return depositTransactionId;
    }
    public void setDepositTransactionId(UUID depositTransactionId) {
        this.depositTransactionId = depositTransactionId;
    }
    public Double getFromAccountNewBalance() {
        return fromAccountNewBalance;
    }
    public void setFromAccountNewBalance(Double fromAccountNewBalance) {
        this.fromAccountNewBalance = fromAccountNewBalance;
    }
    public String getFromAccountNewBalanceCurrency() {
        return fromAccountNewBalanceCurrency;
    }
    public void setFromAccountNewBalanceCurrency(String fromAccountNewBalanceCurrency) {
        this.fromAccountNewBalanceCurrency = fromAccountNewBalanceCurrency;
    }
    public Double getToAccountNewBalance() {
        return toAccountNewBalance;
    }
    public void setToAccountNewBalance(Double toAccountNewBalance) {
        this.toAccountNewBalance = toAccountNewBalance;
    }
    public String getToAccountNewBalanceCurrency() {
        return toAccountNewBalanceCurrency;
    }
    public void setToAccountNewBalanceCurrency(String toAccountNewBalanceCurrency) {
        this.toAccountNewBalanceCurrency = toAccountNewBalanceCurrency;
    }
    public TransferResponse(
            String transferStatus, UUID transferId, UUID withdrawTransactionId, UUID depositTransactionId,
            Double fromAccountNewBalance, String fromAccountNewBalanceCurrency, Double toAccountNewBalance,
            String toAccountNewBalanceCurrency) {
        this.setTransferStatus(transferStatus);
        this.setTransferId(transferId);
        this.setWithdrawTransactionId(withdrawTransactionId);
        this.setDepositTransactionId(depositTransactionId);
        this.setFromAccountNewBalance(fromAccountNewBalance);
        this.setFromAccountNewBalanceCurrency(fromAccountNewBalanceCurrency);
        this.setToAccountNewBalance(toAccountNewBalance);
        this.setToAccountNewBalanceCurrency(toAccountNewBalanceCurrency);
    }
}

