package com.SiddhantBhatia.JAVA_II.EXCEPTIONHANDLING;

public class RuntimeException1 {
    public static void main(String[] args) {
        try{
            int [] arr = new int[5];
            arr[10] = 50;
        }
        catch(RuntimeException e){
            System.out.println("Cannot Divide by zero");
        }
    }
}
