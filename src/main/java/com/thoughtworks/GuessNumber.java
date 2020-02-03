package com.thoughtworks;

import com.thoughtworks.util.RepeatNumberValidator;
import org.apache.commons.lang3.StringUtils;

public class GuessNumber {

    private String answer = "1234";

    public String process(String guess) {
        RepeatNumberValidator validator = new RepeatNumberValidator();
        if (!validator.validate(guess)) {
            return "Wrong Input, input again";
        }
        int aNumber = 0, bNumber = 0;
        for (int i = 0; i < guess.length(); i++) {
            char c = guess.charAt(i);
            if (answer.contains(String.valueOf(c)) && i == answer.indexOf(c)) {
                aNumber++;
            }
            if (answer.contains(String.valueOf(c)) && i != answer.indexOf(c)) {
                bNumber++;
            }
        }
        return StringUtils.join(aNumber, "A", bNumber, "B");
    }
}
