package com.demobank.transfer.port.adapter.controller.transfer;

import java.math.BigDecimal;
import java.util.UUID;

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
public class TransferAmountBetweenAccountsResponse {
    private String transferStatus;
    private UUID transferId;
    private UUID withdrawTransactionId;
    private UUID depositTransactionId;
    private BigDecimal fromAccountNewBalance;
    private String fromAccountNewBalanceCurrency;
    private BigDecimal toAccountNewBalance;
    private String toAccountNewBalanceCurrency;
}

