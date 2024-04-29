package com.exaple.module1;

import com.exaple.module1.exception.DivideException;

public class Calculator {

    int add(int num1, int num2) {
        return num1 + num2;
    }

    int subtract(int num1, int num2) {
        return num1 - num2;
    }

    int divide(int num1, int num2) throws DivideException {
        try {
            return num1 / num2;
        } catch (ArithmeticException e) {
            throw new DivideException("Thia is a divide exception");
        }

    }


}
