package com.example.bank.transfer.domain.model.money;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;

import org.jmolecules.ddd.annotation.ValueObject;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.data.mongodb.core.mapping.FieldType;
import org.springframework.util.Assert;

import com.example.bank.transfer.domain.model.common.BaseValueObject;
import com.example.bank.transfer.domain.model.currency.CurrencyCode;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Getter
@NoArgsConstructor
@EqualsAndHashCode
@ToString
@ValueObject
public class Money implements Serializable, Comparable<Money>, BaseValueObject{

    private static final long serialVersionUID = 1L;
    @Field(targetType = FieldType.DECIMAL128)
    private BigDecimal amount;
    private CurrencyCode currencyCode;
    public Money(BigDecimal amount, CurrencyCode currencyCode) {
        this.setAmount(amount);
        this.setCurrencyCode(currencyCode);
    }
    public BigDecimal getAmount() {
        return amount;
    }
    private void setAmount(BigDecimal amount) {
        Objects.requireNonNull(amount, "amount must not be empty");
        this.amount = amount;
    }
    public CurrencyCode getCurrencyCode() {
        return currencyCode;
    }
    private void setCurrencyCode(CurrencyCode currencyCode) {
        this.currencyCode = currencyCode;
    }
    public Money add(Money money) {
        Assert.isTrue(this.getCurrencyCode().equals(money.getCurrencyCode()), "money objects must have same currency code");
        return new Money(
            this.getAmount().add(money.getAmount()),
            this.getCurrencyCode());
    }
    public Money subtract(Money money) {
        Assert.isTrue(this.getCurrencyCode().equals(money.getCurrencyCode()), "money objects must have same currency code");
        return new Money(
            this.getAmount().subtract(money.getAmount()),
            this.getCurrencyCode());
    }
    @Override
    public int compareTo(Money Money) {
        return this.getAmount().compareTo(Money.getAmount());
    }
}
