package com.demobank.transfer.domain.model.transfer;

import java.io.Serializable;
import java.util.UUID;

import org.springframework.data.annotation.PersistenceCreator;
import org.springframework.util.Assert;

public class TransferId implements Serializable, Comparable<TransferId>{

    private static final long serialVersionUID = 1L;
    private final UUID id;
    public UUID getId() {
        return id;
    }
    @PersistenceCreator
    public TransferId(UUID id) {
        super();
        Assert.hasLength(id.toString(), "Transfer Id must not be empty");
        this.id = id;
    }
    public TransferId() {
        super();
        this.id = UUID.randomUUID();
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        TransferId other = (TransferId) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }
    @Override
    public String toString() {
        return "TransferId [id=" + id + "]";
    }
    @Override
    public int compareTo(TransferId transferId) {
        return this.getId().compareTo(transferId.getId());
    }
}
