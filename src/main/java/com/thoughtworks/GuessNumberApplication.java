package com.thoughtworks;

import static com.thoughtworks.common.Constant.CURRENT_GUESS_RESULT_MESSAGE;
import static com.thoughtworks.common.Constant.EVERY_INPUT_MESSAGE;
import static com.thoughtworks.common.Constant.GAME_BEGIN_MESSAGE;
import static com.thoughtworks.common.Constant.INPUT_HISTORY_MESSAGE;
import static com.thoughtworks.common.Constant.MAX_INPUT_TIME;

import com.thoughtworks.guess.GuessNumber;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GuessNumberApplication {


    public static void main(String[] args) {
        System.out.println(GAME_BEGIN_MESSAGE);
        GuessNumber guessNumber = new GuessNumber();
        List<String> inputList = new ArrayList<>();
        for (int i = 0; i < MAX_INPUT_TIME; i++) {
            System.out.println(EVERY_INPUT_MESSAGE);
            Scanner in = new Scanner(System.in);
            String input = in.nextLine();

            inputList.add(input);
            String result = guessNumber.process(input);
            System.out.println(INPUT_HISTORY_MESSAGE);
            inputList.forEach(System.out::println);
            System.out.println(CURRENT_GUESS_RESULT_MESSAGE + result);
        }
    }
}
