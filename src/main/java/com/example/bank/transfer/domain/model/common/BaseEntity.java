package com.example.bank.transfer.domain.model.common;

import java.io.Serializable;
import java.util.Optional;

//import org.springframework.data.annotation.Version;
import org.springframework.data.domain.Persistable;

import jakarta.annotation.Nonnull;
import jakarta.annotation.Nullable;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@NoArgsConstructor
public abstract class BaseEntity<Id extends Serializable> implements Persistable<Id> {

    //@Version
    private Long version;

    public @Nonnull Optional<Long> getVersion() {
        return Optional.ofNullable(version);
    }

    protected void setVersion(@Nullable Long version) { 
        this.version = version;
    }
}
