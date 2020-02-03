package com.thoughtworks;

import static junit.framework.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class GuessNumberTest {

    private GuessNumber guessNumber;

    @Before
    public void setUp() throws Exception {
        guessNumber = new GuessNumber();
    }

    @Test
    public void should_return_1A0B_when_input_1567_with_one_correct() {
        String res = guessNumber.process("1567");
        assertEquals("1A0B", res);
        assertEquals("1A0B", res);
    }
}