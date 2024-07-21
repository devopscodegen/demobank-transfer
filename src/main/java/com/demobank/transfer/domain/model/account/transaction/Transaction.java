package com.demobank.transfer.domain.model.account.transaction;

import org.jmolecules.ddd.annotation.ValueObject;

import com.demobank.transfer.domain.model.account.AccountId;
import com.demobank.transfer.domain.model.common.BaseValueObject;
import com.demobank.transfer.domain.model.money.Money;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
@ValueObject
public class Transaction implements BaseValueObject {

    private TransactionId transactionId;
    private AccountId accountId;
    private Money amount;
    private TransactionStatus transactionStatus;
    private Money newBalance;
}
