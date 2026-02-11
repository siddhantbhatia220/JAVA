package com.SiddhantBhatia.JAVA_II.EXCEPTIONHANDLING;

public class ThrowableException {
    public static void main(String[] args) {
        try{
            int x = 10/0;
        }
        catch(Throwable e){
            System.out.println("Cannot divide by zero");
        }
    }
}
