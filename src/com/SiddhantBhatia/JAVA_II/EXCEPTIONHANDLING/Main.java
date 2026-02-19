package com.SiddhantBhatia.JAVA_II.EXCEPTIONHANDLING;

public class Main {
    static int test(){
        try{
            return 10;
        }
        finally{
            System.out.println("Finally executed ");
        }
    }
    public static void main(String[] args) {
        System.out.println(test());
    }
}
