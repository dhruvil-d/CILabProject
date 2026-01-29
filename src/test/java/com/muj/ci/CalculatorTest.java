package com.muj.ci;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        if (calc.add(2, 3) == 5) {
            System.out.println("Test Passed");
        } else {
            System.out.println("Test Failed");
        }
    }
}
