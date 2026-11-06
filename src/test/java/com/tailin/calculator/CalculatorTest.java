package com.tailin.calculator;

import com.tailin.calculator.calculator.Calculator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorTest {
    @Test
    void AdditionReturnCorrectResults() {
        assertEquals(8.0, Calculator.calculate(5, 3,"+"), 0.001);
    }
    @Test
    void DivisionByZeroThrowException(){
        assertThrows(ArithmeticException.class, () -> Calculator.calculate(5, 0, "/"));
    }
    @Test
    void SubReturnCorrectResults() {
        assertEquals(5.0, Calculator.calculate(10, 5,"-"), 0.001);
    }
    @Test
    void MulReturnCorrectResults(){
        assertEquals(20, Calculator.calculate(5, 4, "*"), 0.001);
    }
}
