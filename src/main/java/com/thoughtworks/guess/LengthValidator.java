package com.thoughtworks.guess;

import static com.thoughtworks.common.Constant.INPUT_LENGTH;

public class LengthValidator implements Validator {

    @Override
    public boolean validate(String value) {
        return value.length() == INPUT_LENGTH;
    }
}
