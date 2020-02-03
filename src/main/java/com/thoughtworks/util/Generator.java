package com.thoughtworks.util;

import java.util.Random;
import org.apache.commons.lang3.StringUtils;

public class Generator {

    public static String generate() {
        String res = StringUtils.EMPTY;
        Random random = new Random();
        while (true) {
            int i = random.nextInt(10);
            if (!res.contains(String.valueOf(i))) {
                res = res + i;
            }
            Integer INPUT_LENGTH = 4;
            if (res.length() == INPUT_LENGTH) {
                break;
            }
        }
        return res;
    }
}
