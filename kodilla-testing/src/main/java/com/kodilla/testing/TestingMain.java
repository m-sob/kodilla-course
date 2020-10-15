package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args){
        Calculator calculator = new Calculator();

        //add
        int sum = calculator.add(2,3);
        if (sum == 5) {
            System.out.println("Add test OK");
        } else {
            System.out.println("Error in add test!");
        }

        //subtract
        int difference = calculator.subtract(5,4);
        if (difference == 1) {
            System.out.println("Subtract test OK");
        } else {
            System.out.println("Error in subtract test!");
        }
    }
}
