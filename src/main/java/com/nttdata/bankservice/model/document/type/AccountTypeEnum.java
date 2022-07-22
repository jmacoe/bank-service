package com.nttdata.bankservice.model.document.type;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.nttdata.bankservice.exception.UnknownEnumValueException;

public enum AccountTypeEnum {
	SAVINGS("S"),
	CHECKINGACCOUNT("C"),
	TIMEDEPOSIT("T");

	private String value;

    @JsonValue
    public String getValue() {
        return value;
    }

    @JsonCreator
    public static AccountTypeEnum of(String value) {
        if (null == value) {
            return null;
        }

        for (AccountTypeEnum item : AccountTypeEnum.values()) {
            if (value.equals(item.getValue())) {
                return item;
            }
        }

        throw new UnknownEnumValueException("AccountTypeEnum: unknown value: " + value);
    }

    AccountTypeEnum(String value) {
        this.value = value;
    }
	
}
