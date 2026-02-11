package com.SiddhantBhatia.JAVA_II.EXCEPTIONHANDLING;

public class MultipleCatchBlocks {
    public static void main(String[] args) {
        try{
            int arr[] = new int[5];
            arr[10] = 50; //for ArrayIndexOutOfBoundsException
            //arr[10] = 50/0; //for ArithmetciException
        }
        catch(ArithmeticException e){
            System.out.println("Arithmetic Error");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Index Error");
        }
    }
}

