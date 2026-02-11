package com.SiddhantBhatia.JAVA_II.EXCEPTIONHANDLING;

public class DryRunCode {
    public static void main(String[] args) {
        try{
            int x = 5;
            int y = 0;
            int z = x / y;
            System.out.println("After Divison");//this will not be printed because exception is thrown above
        }
        catch(ArithmeticException e){
            System.out.println("Exception occured");
        }
        System.out.println("Program ends");
    }
}
