package com.thoughtworks.guess;

import static com.thoughtworks.common.Constant.A;
import static com.thoughtworks.common.Constant.B;
import static com.thoughtworks.common.Constant.WRONG_INPUT_ERROR_MSG;
import static java.lang.String.valueOf;

import lombok.Builder;
import org.apache.commons.lang3.StringUtils;

@Builder
public class GuessNumber {

    private String answer;

    public String process(String guess) {
        if (validate(guess)) {
            return WRONG_INPUT_ERROR_MSG;
        }
        int aNumber = 0, bNumber = 0;
        for (int i = 0; i < guess.length(); i++) {
            char c = guess.charAt(i);
            if (answer.contains(valueOf(c)) && i == answer.indexOf(c)) {
                aNumber++;
            }
            if (answer.contains(valueOf(c)) && i != answer.indexOf(c)) {
                bNumber++;
            }
        }
        return StringUtils.join(aNumber, A, bNumber, B);
    }

    private boolean validate(String guess) {
        RepeatNumberValidator validator = new RepeatNumberValidator();
        LengthValidator lengthValidator = new LengthValidator();
        return !validator.validate(guess) || !lengthValidator.validate(guess);
    }
}
