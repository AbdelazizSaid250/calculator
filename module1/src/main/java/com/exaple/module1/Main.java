package com.exaple.module1;

import com.exaple.module1.exception.DivideException;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.add(1, 3));
        try {
            System.out.println(calculator.divide(1, 0));
        } catch (DivideException exception) {
            System.out.println(exception.getErrorMessage());
            System.out.println(exception.getErrorCode());
        }

    }
}
