package org.example;

public class App {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        System.out.println("Sum: " + calculator.add(10, 5));
        System.out.println("Product: " + calculator.multiply(10, 5));
        System.out.println("Subtract: " + calculator.subtract(10, 5));
        System.out.println("Divide: " + calculator.divide(10, 5));
        System.out.println("Reverse: " + calculator.reverse("hello"));
    }
}