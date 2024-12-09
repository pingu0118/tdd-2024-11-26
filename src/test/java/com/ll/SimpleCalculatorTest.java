package com.ll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SimpleCalculatorTest {
    @Test
    @DisplayName("1 + 2 = 3")
    public void testPlus() {
        SimpleCalculator simpleCalculator = new SimpleCalculator();
        int rs = simpleCalculator.plus(1, 2);

        assertEquals(3, rs);
    }


    @Test
    @DisplayName("2 + 10 =12")// 자연어에 가깝게 해석 가능
    public void t2() {
        SimpleCalculator simpleCalculator = new SimpleCalculator();
        int rs = simpleCalculator.plus(2,10);

        assertEquals(12, rs);
    }

    @Test
    @DisplayName("20 + 10 = 30")
    public void t3() {
        SimpleCalculator simpleCalculator = new SimpleCalculator();
        int rs = simpleCalculator.plus(20, 10);

        assertEquals(30, rs);
    }
}