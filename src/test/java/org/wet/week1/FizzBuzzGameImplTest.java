package org.wet.week1;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;


class FizzBuzzGameImplTest {

    private FizzBuzzGame fizzBuzzGame;

    @BeforeEach
    void setUp() {
        fizzBuzzGame = new FizzBuzzGameImpl();
    }

    @Test
    @DisplayName("3의 입력을 받은 피즈버즈 게임의 정답은 Fizz")
    void answerForThreeIsFizz() throws Exception {
        // when - 동작
        String answer = fizzBuzzGame.playGame(3);

        // then - 검증
        assertEquals("Fizz", answer);
    }

    @Test
    @DisplayName("5의 입력을 받은 피즈버즈 게임의 정답은 Buzz")
    void answerForFiveIsBuzz() throws Exception {
        // when - 동작
        String answer = fizzBuzzGame.playGame(5);

        // then - 검증
        assertEquals("Buzz", answer);
    }

    @Test
    @DisplayName("15 가 입력된 피즈버즈 게임의 정답은 FizzBuzz")
    void answerForFifthteenIsFizzBuzz() throws Exception {
        // when - 동작
        String answer = fizzBuzzGame.playGame(15);

        // then - 검증
        assertEquals("FizzBuzz", answer);
    }

    //=== 경계값 ===//

    @Test
    @DisplayName("3과 5의 배수가 아닌 자연수의 정답은 'Fail'")
    void answerForNonThreeAndFiveMultipleFailsTheGame() throws Exception {
        // when - 동작
        String answer = fizzBuzzGame.playGame(2);

        // then - 검증
        assertEquals("Fail", answer);
    }

    @Test
    @DisplayName("0의 피즈버즈 게임의 정답은 'Fail'")
    void answerForZeroFailsTheGame() throws Exception {
        // when - 동작
        String answer = fizzBuzzGame.playGame(0);

        // then - 검증
        assertEquals("Fail", answer);
    }

    @Test
    @DisplayName("음수의 피즈버즈 게임의 정답은 'Fail'")
    void answerForNegativeFailsTheGame() throws Exception {
        // when - 동작
        String answer = fizzBuzzGame.playGame(-1);

        // then - 검증
        assertEquals("Fail", answer);
    }

}