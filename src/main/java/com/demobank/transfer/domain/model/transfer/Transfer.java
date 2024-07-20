package com.demobank.transfer.domain.model.transfer;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

import com.demobank.transfer.domain.model.account.AccountId;
import com.demobank.transfer.domain.model.account.transaction.TransactionId;
import com.demobank.transfer.domain.model.common.BaseAggregateRoot;
import com.demobank.transfer.domain.model.money.Money;

import jakarta.annotation.Nullable;

@Document("transfers")
public class Transfer extends BaseAggregateRoot<Transfer, TransferId>{
    @Id
    private TransferId transferId;
    private AccountId fromAccountId;
    private AccountId toAccountId;
    private Money amount;
    private TransferStatus transferStatus;
    private TransactionId withdrawTransactionId;
    private TransactionId depositTransactionId;
    private Money fromAccountNewBalance;
    private Money toAccountNewBalance;
    public TransferId getTransferId() {
        return transferId;
    }
    private void setTransferId(TransferId transferId) {
        this.transferId = transferId;
    }
    public AccountId getFromAccountId() {
        return fromAccountId;
    }
    private void setFromAccountId(AccountId fromAccountId) {
        this.fromAccountId = fromAccountId;
    }
    public AccountId getToAccountId() {
        return toAccountId;
    }
    private void setToAccountId(AccountId toAccountId) {
        this.toAccountId = toAccountId;
    }
    public Money getAmount() {
        return amount;
    }
    private void setAmount(Money amount) {
        this.amount = amount;
    }
    public TransferStatus getTransferStatus() {
        return transferStatus;
    }
    private void setTransferStatus(TransferStatus transferStatus) {
        this.transferStatus = transferStatus;
    }
    public TransactionId getWithdrawTransactionId() {
        return withdrawTransactionId;
    }
    private void setWithdrawTransactionId(TransactionId withdrawTransactionId) {
        this.withdrawTransactionId = withdrawTransactionId;
    }
    public TransactionId getDepositTransactionId() {
        return depositTransactionId;
    }
    private void setDepositTransactionId(TransactionId depositTransactionId) {
        this.depositTransactionId = depositTransactionId;
    }
    public Money getFromAccountNewBalance() {
        return fromAccountNewBalance;
    }
    private void setFromAccountNewBalance(Money fromAccountNewBalance) {
        this.fromAccountNewBalance = fromAccountNewBalance;
    }
    public Money getToAccountNewBalance() {
        return toAccountNewBalance;
    }
    private void setToAccountNewBalance(Money toAccountNewBalance) {
        this.toAccountNewBalance = toAccountNewBalance;
    }
    public Transfer(TransferId transferId, AccountId fromAccountId, AccountId toAccountId, Money amount,
            TransferStatus transferStatus, TransactionId withdrawTransactionId, TransactionId depositTransactionId,
            Money fromAccountNewBalance, Money toAccountNewBalance) {
        super();
        this.setTransferId(transferId);
        this.setFromAccountId(fromAccountId);
        this.setToAccountId(toAccountId);
        this.setAmount(amount);
        this.setTransferStatus(transferStatus);
        this.setWithdrawTransactionId(withdrawTransactionId);
        this.setDepositTransactionId(depositTransactionId);
        this.setFromAccountNewBalance(fromAccountNewBalance);
        this.setToAccountNewBalance(toAccountNewBalance);
        registerEvent(new AmountTransferredBetweenAccounts(this));
    }
    @Nullable
	@Override
	public TransferId getId() {
		return this.getTransferId();
	}
	@Transient
	@Override
	public boolean isNew() {
		return null == getId();
	}
}

