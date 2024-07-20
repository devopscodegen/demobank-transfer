package com.demobank.transfer.domain.model.transfer;

import java.util.Date;

import com.demobank.transfer.domain.model.common.BaseDomainEvent;

public class AmountTransferredBetweenAccounts extends BaseDomainEvent {
    private Transfer transfer;

    public AmountTransferredBetweenAccounts() {
        super();
    }

    public Transfer getTransfer() {
        return this.transfer;
    }

    private void setTransfer(Transfer transfer) {
        this.transfer = transfer;
    }

    public AmountTransferredBetweenAccounts(Transfer transfer) {
        super();
        this.setTransfer(transfer);
        this.setEventVersion(1);
        this.setOccurredOn(new Date());
        this.setEventType(this.getClass().getName());
    }
}

