package com.kodilla.testing.calculator;

public class Calculator {
    public int add(int a, int b){
        return a + b;
    }

    public int subtract(int a, int b){
        return a - b;
    }

    public void someMethod(){
        System.out.println("It works.");
    }

    public static void main (String[] args) {
        Calculator calculator = new Calculator();
        calculator.someMethod();

    }
}
