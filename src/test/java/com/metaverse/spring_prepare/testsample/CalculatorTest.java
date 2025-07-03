package com.metaverse.spring_prepare.testsample;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    @Test
    @DisplayName("더하기 테스트")
    void test1(){
        Calculator calculator = new Calculator();
        Double result = calculator.operate(1,"+",2);
        System.out.println("result: "+result);

        Assertions.assertEquals(3, result);
    }

    @Test
    @DisplayName("나누기 테스트")
    void test2(){
        Calculator calculator = new Calculator();
        Double result = calculator.operate(8,"/",2);
        System.out.println("result: "+result);

        Assertions.assertEquals(8, result);
    }
}