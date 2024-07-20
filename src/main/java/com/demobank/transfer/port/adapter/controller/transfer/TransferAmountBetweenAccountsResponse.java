package com.demobank.transfer.port.adapter.controller.transfer;

import java.math.BigDecimal;
import java.util.UUID;

public class TransferAmountBetweenAccountsResponse {
    private String transferStatus;
    private UUID transferId;
    private UUID withdrawTransactionId;
    private UUID depositTransactionId;
    private BigDecimal fromAccountNewBalance;
    private String fromAccountNewBalanceCurrency;
    private BigDecimal toAccountNewBalance;
    private String toAccountNewBalanceCurrency;
    public String getTransferStatus() {
        return transferStatus;
    }
    private void setTransferStatus(String transferStatus) {
        this.transferStatus = transferStatus;
    }
    public UUID getTransferId() {
        return transferId;
    }
    private void setTransferId(UUID transferId) {
        this.transferId = transferId;
    }
    public UUID getWithdrawTransactionId() {
        return withdrawTransactionId;
    }
    private void setWithdrawTransactionId(UUID withdrawTransactionId) {
        this.withdrawTransactionId = withdrawTransactionId;
    }
    public UUID getDepositTransactionId() {
        return depositTransactionId;
    }
    private void setDepositTransactionId(UUID depositTransactionId) {
        this.depositTransactionId = depositTransactionId;
    }
    public BigDecimal getFromAccountNewBalance() {
        return fromAccountNewBalance;
    }
    private void setFromAccountNewBalance(BigDecimal fromAccountNewBalance) {
        this.fromAccountNewBalance = fromAccountNewBalance;
    }
    public String getFromAccountNewBalanceCurrency() {
        return fromAccountNewBalanceCurrency;
    }
    private void setFromAccountNewBalanceCurrency(String fromAccountNewBalanceCurrency) {
        this.fromAccountNewBalanceCurrency = fromAccountNewBalanceCurrency;
    }
    public BigDecimal getToAccountNewBalance() {
        return toAccountNewBalance;
    }
    private void setToAccountNewBalance(BigDecimal toAccountNewBalance) {
        this.toAccountNewBalance = toAccountNewBalance;
    }
    public String getToAccountNewBalanceCurrency() {
        return toAccountNewBalanceCurrency;
    }
    private void setToAccountNewBalanceCurrency(String toAccountNewBalanceCurrency) {
        this.toAccountNewBalanceCurrency = toAccountNewBalanceCurrency;
    }
    public TransferAmountBetweenAccountsResponse(
            String transferStatus, UUID transferId, UUID withdrawTransactionId, UUID depositTransactionId,
            BigDecimal fromAccountNewBalance, String fromAccountNewBalanceCurrency, BigDecimal toAccountNewBalance,
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

