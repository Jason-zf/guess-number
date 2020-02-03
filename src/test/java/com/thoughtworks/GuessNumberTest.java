package com.thoughtworks;

import static junit.framework.Assert.assertEquals;

import com.thoughtworks.guess.GuessNumber;
import org.junit.Before;
import org.junit.Test;

public class GuessNumberTest {

    private GuessNumber guessNumber;

    @Before
    public void setUp() throws Exception {
        guessNumber = GuessNumber.builder()
            .answer("1234")
            .build();
    }

    @Test
    public void should_return_1A0B_when_input_1567_with_one_correct() {
        String res = guessNumber.process("1567");
        assertEquals("1A0B", res);
    }

    @Test
    public void should_return_0A2B_when_input_2478_with_two_wrong_position() {
        String res = guessNumber.process("2478");
        assertEquals("0A2B", res);
    }

    @Test
    public void should_return_1A2B_when_input_0324_with_three_correct_and_two_wrong_position() {
        String res = guessNumber.process("0324");
        assertEquals("1A2B", res);
    }

    @Test
    public void should_return_0A0B_when_input_5678_with_all_wrong() {
        String res = guessNumber.process("5678");
        assertEquals("0A0B", res);
    }

    @Test
    public void should_return_0A4B_when_input_4321_with_four_wrong_position() {
        String res = guessNumber.process("4321");
        assertEquals("0A4B", res);
    }

    @Test
    public void should_return_4A0B_when_input_1234_with_all_correct() {
        String res = guessNumber.process("1234");
        assertEquals("4A0B", res);
    }

    @Test
    public void should_return_error_msg_when_input_1123_with_repeat_number() {
        String res = guessNumber.process("1123");
        assertEquals("Wrong Input, input again", res);
    }

    @Test
    public void should_return_error_msg_when_input_12_with_error_size() {
        String res = guessNumber.process("12");
        assertEquals("Wrong Input, input again", res);
    }
}