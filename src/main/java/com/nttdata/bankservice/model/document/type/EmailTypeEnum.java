package com.nttdata.bankservice.model.document.type;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.nttdata.bankservice.exception.UnknownEnumValueException;

public enum EmailTypeEnum {
	HOME("H"),
	WORK("W"),
	OTHER("O");

	private String value;

    @JsonValue
    public String getValue() {
        return value;
    }

    @JsonCreator
    public static EmailTypeEnum of(String value) {
        if (null == value) {
            return null;
        }

        for (EmailTypeEnum item : EmailTypeEnum.values()) {
            if (value.equals(item.getValue())) {
                return item;
            }
        }

        throw new UnknownEnumValueException("EmailTypeEnum: unknown value: " + value);
    }

    EmailTypeEnum(String value) {
        this.value = value;
    }
	
}