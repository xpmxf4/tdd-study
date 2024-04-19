package org.wet.week1;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;


class FizzBuzzGameImplTest {

    @Test
    @DisplayName("3의 입력을 받은 피즈버즈 게임의 정답은 Fizz")
    void answerForThreeIsFizz() throws Exception {
        // given - 상황 만들기
        int input = 3;
        FizzBuzzGame fizzBuzzGame = new FizzBuzzGameImpl();

        // when - 동작
        String answer = fizzBuzzGame.playGame(input);

        // then - 검증
        assertEquals("Fizz", answer);
    }

    @Test
    @DisplayName("5의 입력을 받은 피즈버즈 게임의 정답은 Buzz")
    void answerForFiveIsBuzz() throws Exception {
        // given - 상황 만들기
        int input = 5;
        FizzBuzzGame fizzBuzzGame = new FizzBuzzGameImpl();

        // when - 동작
        String answer = fizzBuzzGame.playGame(input);

        // then - 검증
        assertEquals("Buzz", answer);
    }

    @Test
    @DisplayName("15 가 입력된 피즈버즈 게임의 정답은 FizzBuzz")
    void answerForFifthteenIsFizzBuzz() throws Exception {
        // given - 상황 만들기
        int input = 15;
        FizzBuzzGame fizzBuzzGame = new FizzBuzzGameImpl();

        // when - 동작
        String answer = fizzBuzzGame.playGame(input);

        // then - 검증
        assertEquals("FizzBuzz", answer);
    }

    @Test
    @DisplayName("3과 5의 배수가 아닌 자연수의 정답은 'Fail'")
    void answerForNonThreeAndFiveMultipleFailsTheGame() throws Exception {
        // given - 상황 만들기
        int input = 2;
        FizzBuzzGame fizzBuzzGame = new FizzBuzzGameImpl();

        // when - 동작
        String answer = fizzBuzzGame.playGame(input);

        // then - 검증
        assertEquals("Fail", answer);
    }

    @Test
    @DisplayName("0의 피즈버즈 게임의 정답은 'Fail'")
    void answerForZeroFailsTheGame() throws Exception {
        // given - 상황 만들기
        int input = 0;
        FizzBuzzGame fizzBuzzGame = new FizzBuzzGameImpl();

        // when - 동작
        String answer = fizzBuzzGame.playGame(input);

        // then - 검증
        assertEquals("Fail", answer);
    }

    @Test
    @DisplayName("음수의 피즈버즈 게임의 정답은 'Fail'")
    void answerForNegativeFailsTheGame() throws Exception {
        // given - 상황 만들기
        int input = -1;
        FizzBuzzGame fizzBuzzGame = new FizzBuzzGameImpl();

        // when - 동작
        String answer = fizzBuzzGame.playGame(input);

        // then - 검증
        assertEquals("Fail", answer);
    }

}