package com.demobank.transfer.domain.model.transfer;

import java.util.Date;

import org.jmolecules.event.annotation.DomainEvent;

import com.demobank.transfer.domain.model.common.BaseDomainEvent;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@ToString
@DomainEvent
public class AmountTransferredBetweenAccounts extends BaseDomainEvent {
    private Transfer transfer;

    public AmountTransferredBetweenAccounts(Transfer transfer) {
        super();
        this.setTransfer(transfer);
        this.setEventVersion(1);
        this.setOccurredOn(new Date());
        this.setEventType(this.getClass().getName());
    }
}

