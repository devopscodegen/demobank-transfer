package com.demobank.transfer.port.adapter.controller;

public class TransferRequest {
    private String fromAccountId;
    private String toAccountId;
    private Double amount;
    private String currency;

    public TransferRequest(String fromAccountId, String toAccountId, Double amount, String currency) {
        super();

        setFromAccountId(fromAccountId);
        setToAccountId(toAccountId);
        setAmount(amount);
        setCurrency(currency);
    }

    public TransferRequest() {
        super();
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

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }
}