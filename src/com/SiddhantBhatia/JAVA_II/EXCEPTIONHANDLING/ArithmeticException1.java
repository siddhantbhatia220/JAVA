package com.SiddhantBhatia.JAVA_II.EXCEPTIONHANDLING;

public class ArithmeticException1 {
    public static void main(String[] args) {
        try{
            int x = 10/0;
        }
        catch(ArithmeticException e){
            System.out.println("Cannot divide by zero");
        }
    }
}

//Children of throwable class

//check exception : SQLException , IOException
//unchecked : ArrayOutOfBound , NullPointer , ArithmeticException , NumberFormatException