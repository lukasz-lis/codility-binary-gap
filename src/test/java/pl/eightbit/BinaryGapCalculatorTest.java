package pl.eightbit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BinaryGapCalculatorTest {

    private BinaryGapCalculator binaryGapCalculator;

    @BeforeEach
    void beforeEach() {
        binaryGapCalculator = new BinaryGapCalculator();
    }

    @Test
    void expectToCalculateMaxValueOfInteger() {
        //when
        int result = binaryGapCalculator.calculate(Integer.MAX_VALUE);

        //then
        assertEquals(result, 0);
    }

    @ParameterizedTest
    @ValueSource(ints = { -1, 0 })
    void expectToReturn0ForArguments(int argument) {
        //when
        int result = binaryGapCalculator.calculate(argument);

        //then
        assertEquals(0, result);
    }

}