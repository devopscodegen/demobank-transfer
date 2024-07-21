package com.demobank.transfer.domain.model.transfer;

import org.jmolecules.ddd.annotation.AggregateRoot;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

import com.demobank.transfer.domain.model.account.AccountId;
import com.demobank.transfer.domain.model.account.transaction.TransactionId;
import com.demobank.transfer.domain.model.common.BaseAggregateRoot;
import com.demobank.transfer.domain.model.money.Money;

import jakarta.annotation.Nullable;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Document("transfers")
@Getter
@Setter
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true, callSuper = false)
@ToString
@AggregateRoot
public class Transfer extends BaseAggregateRoot<Transfer, TransferId>{

    @Id
    @EqualsAndHashCode.Include 
    private TransferId transferId;
    private AccountId fromAccountId;
    private AccountId toAccountId;
    private Money amount;
    private TransferStatus transferStatus;
    private TransactionId withdrawTransactionId;
    private TransactionId depositTransactionId;
    private Money fromAccountNewBalance;
    private Money toAccountNewBalance;
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
		return null == this.getId();
	}
}

