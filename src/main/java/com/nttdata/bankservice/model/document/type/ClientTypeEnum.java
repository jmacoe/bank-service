package com.nttdata.bankservice.model.document.type;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.nttdata.bankservice.exception.UnknownEnumValueException;

public enum ClientTypeEnum {
	PERSONAL("P"),
	ENTERPRISE("E");

	private String value;

    @JsonValue
    public String getValue() {
        return value;
    }

    @JsonCreator
    public static ClientTypeEnum of(String value) {
        if (null == value) {
            return null;
        }

        for (ClientTypeEnum item : ClientTypeEnum.values()) {
            if (value.equals(item.getValue())) {
                return item;
            }
        }

        throw new UnknownEnumValueException("ClientTypeEnum: unknown value: " + value);
    }

    ClientTypeEnum(String value) {
        this.value = value;
    }
	
}