package com.SiddhantBhatia.JAVA_II.BITMASKING;
//OddEven Code using And Operator
public class OddEven {
    public static void main(String[] args) {
        int num = 5;
        if((num &1) == 0){
            System.out.println("Even");
        }
        else {
            System.out.println("Odd");
        }
    }
}
