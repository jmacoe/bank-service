package com.nttdata.bankservice.model.document.type;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.nttdata.bankservice.exception.UnknownEnumValueException;

public enum PhoneTypeEnum {
	HOME("H"),
	WORK("W"),
	OTHER("O");

	private String value;

    @JsonValue
    public String getValue() {
        return value;
    }

    @JsonCreator
    public static PhoneTypeEnum of(String value) {
        if (null == value) {
            return null;
        }

        for (PhoneTypeEnum item : PhoneTypeEnum.values()) {
            if (value.equals(item.getValue())) {
                return item;
            }
        }

        throw new UnknownEnumValueException("PhoneTypeEnum: unknown value: " + value);
    }

    PhoneTypeEnum(String value) {
        this.value = value;
    }
	
}