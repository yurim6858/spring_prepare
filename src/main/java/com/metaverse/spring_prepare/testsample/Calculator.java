package com.metaverse.spring_prepare.testsample;

// 테스트코드 소개용 계산기
public class Calculator {
    public Double operate(double num1,String op, double num2){
        switch(op){
            case "*":
                return num1*num2;
            case "/":
                if(num2!=0)
                    return num1/num2;
                else
                    return null;
            case "+":
                return num1+num2;
            case "-":
                return num1-num2;
            default:
                throw new IllegalArgumentException("Invalid operation");
        }
    }
}
