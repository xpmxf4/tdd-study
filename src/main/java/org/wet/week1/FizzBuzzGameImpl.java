package org.wet.week1;

public class FizzBuzzGameImpl implements FizzBuzzGame {
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

        return null;
    }
}
