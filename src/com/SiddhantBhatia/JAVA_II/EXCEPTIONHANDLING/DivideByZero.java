package com.SiddhantBhatia.JAVA_II.EXCEPTIONHANDLING;

public class DivideByZero {
    public static void main(String[] args) {
        int x = 10;
        System.out.println(x/0);
    }
}
//Divide by zero
//Error
//Exception in thread "main" java.lang.ArithmeticException: / by zero
//Which are the class of the "throwable" class