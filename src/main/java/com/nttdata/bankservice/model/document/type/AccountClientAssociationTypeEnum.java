package com.nttdata.bankservice.model.document.type;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.nttdata.bankservice.exception.UnknownEnumValueException;

public enum AccountClientAssociationTypeEnum {
	UNIQUEOWNER("P"),
	CONJUNCTIVEOWNERS("C"),
	DISJUNCTIVEOWNERS("D");

	private String value;

    @JsonValue
    public String getValue() {
        return value;
    }

    @JsonCreator
    public static AccountClientAssociationTypeEnum of(String value) {
        if (null == value) {
            return null;
        }

        for (AccountClientAssociationTypeEnum item : AccountClientAssociationTypeEnum.values()) {
            if (value.equals(item.getValue())) {
                return item;
            }
        }

        throw new UnknownEnumValueException("AccountClientAssociationTypeEnum: unknown value: " + value);
    }

    AccountClientAssociationTypeEnum(String value) {
        this.value = value;
    }
	
}