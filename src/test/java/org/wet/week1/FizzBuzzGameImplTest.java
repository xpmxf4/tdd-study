package org.wet.week1;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzGameImplTest {

    @Test
    @DisplayName("15 입력시 1~15 까지 FizzBuzz 게임의 결과물을 본다.")
    void playGame() {
        FizzBuzzGame fizzBuzzGame = new FizzBuzzGameImpl();

        String answer = "1\n2\nFizz\n4\nBuzz\nFizz\n7\n8\nFizz\nBuzz\n11\nFizz\n13\n14\nFizzBuzz";
        String result = fizzBuzzGame.playGame(15);

        Assertions.assertEquals(answer, result);
    }

}