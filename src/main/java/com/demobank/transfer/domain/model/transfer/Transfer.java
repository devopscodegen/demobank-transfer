package com.demobank.transfer.domain.model.transfer;

import java.util.UUID;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Transfer {
    @Id
    private UUID transferId;
    private String fromAccountId;
    private String toAccountId;
    private Double amount;
    private String currencyCode;
    private TransferStatus transferStatus;
    private UUID withdrawTransactionId;
    private UUID depositTransactionId;
    private Double fromAccountNewBalance;
    private String fromAccountNewBalanceCurrency;
    private Double toAccountNewBalance;
    private String toAccountNewBalanceCurrency;
    public UUID getTransferId() {
        return transferId;
    }
    public void setTransferId(UUID transferId) {
        this.transferId = transferId;
    }
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
    public String getCurrencyCode() {
        return currencyCode;
    }
    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }
    public TransferStatus getTransferStatus() {
        return transferStatus;
    }
    public void setTransferStatus(TransferStatus transferStatus) {
        this.transferStatus = transferStatus;
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
    public Transfer(UUID transferId, String fromAccountId, String toAccountId, Double amount, String currencyCode,
            TransferStatus transferStatus, UUID withdrawTransactionId, UUID depositTransactionId,
            Double fromAccountNewBalance, String fromAccountNewBalanceCurrency, Double toAccountNewBalance,
            String toAccountNewBalanceCurrency) {
        this.setTransferId(transferId);
        this.setFromAccountId(fromAccountId);
        this.setToAccountId(toAccountId);
        this.setAmount(amount);
        this.setCurrencyCode(currencyCode);
        this.setTransferStatus(transferStatus);
        this.setWithdrawTransactionId(withdrawTransactionId);
        this.setDepositTransactionId(depositTransactionId);
        this.setFromAccountNewBalance(fromAccountNewBalance);
        this.setFromAccountNewBalanceCurrency(fromAccountNewBalanceCurrency);
        this.setToAccountNewBalance(toAccountNewBalance);
        this.setToAccountNewBalanceCurrency(toAccountNewBalanceCurrency);
    }
}

