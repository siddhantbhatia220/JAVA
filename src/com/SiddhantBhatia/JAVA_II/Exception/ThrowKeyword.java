package com.SiddhantBhatia.JAVA_II.Exception;

public class ThrowKeyword {
    static void checkAge(int age) {
        if (age < 18) {
            throw new ArithmeticException("Not eligible to vote"); // manually throwing exception
        } else {
            System.out.println("Eligible to vote");
        }
    }
    public static void main(String[] args) {
        try {
            checkAge(16);   // will throw exception
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());  // handling exception
        }
        System.out.println("Program continues...");
    }
}