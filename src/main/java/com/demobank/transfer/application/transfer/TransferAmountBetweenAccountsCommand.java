package com.demobank.transfer.application.transfer;

import java.math.BigDecimal;
import java.math.BigInteger;

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
public class TransferAmountBetweenAccountsCommand {

    private BigInteger fromAccountId;
    private BigInteger toAccountId;
    private BigDecimal amount;
    private String currencyCode;
}
