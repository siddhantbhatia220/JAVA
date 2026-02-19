package com.SiddhantBhatia.JAVA_II.EXCEPTIONHANDLING;

public class RecursiveCall {
    public static int numbers(int n){
        if(n==0){
            return 0;
        }
        try {
            return 0;
        }
        finally {
            System.out.print(n + " ");
            numbers(n - 1);
        }
    }
    public static void main(String[] args) {
        System.out.print(numbers(10));
    }
}
