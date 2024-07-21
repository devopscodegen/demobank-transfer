package com.demobank.transfer.domain.model.currency;

import org.jmolecules.ddd.annotation.ValueObject;

import com.demobank.transfer.domain.model.common.BaseValueObject;

@ValueObject
public enum CurrencyCode implements BaseValueObject{

    USD {
        public boolean isUsd() {
            return true;
        }
    },

    AED {
        public boolean isAed() {
            return true;
        }
    };

    public boolean isUsd() {
        return false;
    }

    public boolean isAed() {
        return false;
    }

    public CurrencyCode regress() {
        if (this.isUsd()) {
            return USD;
        } else if (this.isAed()) {
            return AED;
        }

        return USD;
    }
}
