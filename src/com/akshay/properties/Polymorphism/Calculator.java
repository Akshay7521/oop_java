package com.akshay.properties.Polymorphism;

public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }


}

Calculator calc = new Calculator();
int sum1 = calc.add(3, 5);
// Calls the int add(int a, int b) method
double sum2 = calc.add(3.5, 7.2);
// Calls the double add(double a, double b) method

int sum3 = calc.add(2, 4, 6)
// Calls the int add(int a, int b, int c) method
Association: Composition Aggregation: