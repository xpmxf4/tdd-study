package org.wet.week1;

import java.util.*;

public class FizzBuzzGameImpl implements FizzBuzzGame {

    Random random = new Random();

    @Override
    public String playGame(int number) {
        if (number < 1)
            return "Fail";

        StringBuilder sb = new StringBuilder();

        if (number % 3 == 0) sb.append("Fizz");
        if (number % 5 == 0) sb.append("Buzz");

        if (sb.length() == 0) sb.append("Fail");

        return sb.toString();
    }

    @Override
    public String playGame(int number, String[] expects) {
        if (!isNumberPositive(number))
            return "Fails";

        StringBuilder sb = new StringBuilder();
        int resultNum = number * generateRanNum();
        if (resultNum % 3 == 0) sb.append("Fizz");
        if (resultNum % 5 == 0) sb.append("Buzz");

        for (String expect : expects) {
            if (expect.equals(sb.toString()))
                return "Congratulations";
        }

        return "Loose!";
    }

    public boolean isNumberPositive(int number) {
        return number > 0;
    }

    public int generateRanNum() {
        return random.nextInt(9) + 1;
    }
}
