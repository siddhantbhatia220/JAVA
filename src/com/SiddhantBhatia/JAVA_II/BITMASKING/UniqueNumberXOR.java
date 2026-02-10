package com.SiddhantBhatia.JAVA_II.BITMASKING;

public class UniqueNumberXOR {
    public static void main(String[] args) {
        int [] arr = { 2 , 3 , 5 ,3 , 2};
        int ans = 0;
        for(int x : arr){
            ans = ans^x;
        }
        System.out.println("The unique number is: " + ans);
    }
}
