package com.thoughtworks.util;

public class LengthValidator implements Validator {

    private Integer INPUT_LENGTH = 4;

    @Override
    public boolean validate(String value) {
        return value.length() == INPUT_LENGTH;
    }
}
