package com.demobank.transfer.application.transfer;

public class TransferCommand {

    private String fromAccountId;
    private String toAccountId;
    private Double amount;
    private String currency;

    public TransferCommand(String fromAccountId, String toAccountId, Double amount, String currency) {
        super();

        this.setFromAccountId(fromAccountId);
        this.setToAccountId(toAccountId);
        this.setAmount(amount);
        this.setCurrency(currency);
    }

    public TransferCommand() {
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
