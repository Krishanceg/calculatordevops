package com.devops;

public class App {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        System.out.println("DevOps Calculator Application");
        System.out.println("10 + 5 = " + calculator.add(10, 5));
        System.out.println("10 - 5 = " + calculator.subtract(10, 5));
    }
}