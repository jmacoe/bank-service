package com.nttdata.bankservice.model.document.type;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.nttdata.bankservice.exception.UnknownEnumValueException;

public enum IdentityNumberTypeEnum {
	DNI("D"),
	PASSPORT("P"),
	RUC("R"),
	OTHER("O");

	private String value;

    @JsonValue
    public String getValue() {
        return value;
    }

    @JsonCreator
    public static IdentityNumberTypeEnum of(String value) {
        if (null == value) {
            return null;
        }

        for (IdentityNumberTypeEnum item : IdentityNumberTypeEnum.values()) {
            if (value.equals(item.getValue())) {
                return item;
            }
        }

        throw new UnknownEnumValueException("IdentityNumberTypeEnum: unknown value: " + value);
    }

    IdentityNumberTypeEnum(String value) {
        this.value = value;
    }
	
}