package com.revature;

public class MainCalc {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int result = calculator.sum(3, 5);
        System.out.println("Sum: " + result);
    }
}
