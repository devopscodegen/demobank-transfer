package com.demobank.transfer.domain.model.transfer;

import org.jmolecules.ddd.annotation.ValueObject;

import com.demobank.transfer.domain.model.common.BaseValueObject;

@ValueObject
public enum TransferStatus implements BaseValueObject{

    SUCCESS {
        public boolean isSuccess() {
            return true;
        }
    },

    FAILED {
        public boolean isFailed() {
            return true;
        }
    };

    public boolean isSuccess() {
        return false;
    }

    public boolean isFailed() {
        return false;
    }

    public TransferStatus regress() {
        if (this.isSuccess()) {
            return SUCCESS;
        } else if (this.isFailed()) {
            return FAILED;
        }

        return SUCCESS;
    }
}
