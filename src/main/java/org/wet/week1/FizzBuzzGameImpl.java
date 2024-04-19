package org.wet.week1;

public class FizzBuzzGameImpl implements FizzBuzzGame {
    @Override
    public String playGame(int number) {
        if(number < 1)
            return "Fail";

        return "fails";
    }
}
