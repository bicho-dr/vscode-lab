package org.example;

public class App {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        double result = c.calc(10, 5);
        c.prtRes(result);
    }
}