package com.SiddhantBhatia.JAVA_II.EXCEPTIONHANDLING;

public class NestedTryCatch {
    public static void main(String[] args) {
        try{
            try{
                int x = 10 / 0;
            }
            catch(ArithmeticException e){
                System.out.println("Inner Catch");
            }
        }
        catch(Exception e){
            System.out.println("Outer Catch");
        }
    }
}
