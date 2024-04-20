package org.wet.week1;

import org.junit.jupiter.api.*;

import java.lang.reflect.*;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


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

    @Test
    @DisplayName("유저가 정답을 맞추면, 시스템은 유저에게'Congratulations'를 보여준다")
    void whenCorrectResultIsCongratulations() throws Exception {
        // given - 상황 만들기
        Random mockRandom = mock(Random.class);

        // when - 동작
        when(mockRandom.nextInt(9)).thenReturn(2, 6);
        Field field = FizzBuzzGameImpl.class.getDeclaredField("random");
        field.setAccessible(true);
        field.set(fizzBuzzGame, mockRandom);
        String result = fizzBuzzGame.playGame(3, new String[]{"Fizz", "FizzBUzz"});

        // then - 검증
        assertEquals("Congratulations", result);
    }

    @Test
    @DisplayName("유저가 정답을 맞추지 못하면, 시스템은 유저에게 'Loose!' 를 보여준다")
    void whenIncorrectResultIsLoose() throws Exception {
        // given - 상황 만들기
        Random mockRandom = mock(Random.class);

        // when - 동작
        when(mockRandom.nextInt(9)).thenReturn(1, 9);
        Field field = FizzBuzzGameImpl.class.getDeclaredField("random");
        field.setAccessible(true);
        field.set(fizzBuzzGame, mockRandom);
        String result = fizzBuzzGame.playGame(1, new String[]{"FizzBuzz"});

        // then - 검증
        assertEquals("Loose!", result);
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

    @Test
    @DisplayName("0 이하의 숫자가 들어오면 게임 진행이 안된다.")
    void isNegativeAndZeroGetCaught() throws Exception {
        // when - 동작
        boolean negativeRes = fizzBuzzGame.isNumberPositive(-1);
        boolean zeroRes = fizzBuzzGame.isNumberPositive(0);

        // then - 검증
        assertFalse(negativeRes);
        assertFalse(zeroRes);
    }

}