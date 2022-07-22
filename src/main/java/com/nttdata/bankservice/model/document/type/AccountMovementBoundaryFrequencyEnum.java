package com.nttdata.bankservice.model.document.type;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.nttdata.bankservice.exception.UnknownEnumValueException;

public enum AccountMovementBoundaryFrequencyEnum {
	MOVEMENTBOUNDARY("M"),
	DATEBOUNDARY("D");

	private String value;

    @JsonValue
    public String getValue() {
        return value;
    }

    @JsonCreator
    public static AccountMovementBoundaryFrequencyEnum of(String value) {
        if (null == value) {
            return null;
        }

        for (AccountMovementBoundaryFrequencyEnum item : AccountMovementBoundaryFrequencyEnum.values()) {
            if (value.equals(item.getValue())) {
                return item;
            }
        }

        throw new UnknownEnumValueException("AccountMovementBoundaryFrequencyEnum: unknown value: " + value);
    }

    AccountMovementBoundaryFrequencyEnum(String value) {
        this.value = value;
    }
	
}