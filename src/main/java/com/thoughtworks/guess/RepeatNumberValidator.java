package com.thoughtworks.guess;

import org.apache.commons.lang3.StringUtils;

public class RepeatNumberValidator implements Validator {

    @Override
    public boolean validate(String value) {
        for (int i = 0; i < value.length(); i++) {
            if (StringUtils.countMatches(value, value.charAt(i)) > 1) {
                return false;
            }
        }
        return true;
    }
}
