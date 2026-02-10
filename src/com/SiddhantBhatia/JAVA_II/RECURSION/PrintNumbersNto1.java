package com.SiddhantBhatia.JAVA_II.RECURSION;

import java.util.*;

public class PrintNumbersNto1 {
    public static void printnto1(int n){
        if(n==0){
            return;
        }
        System.out.print(n+" ");
        printnto1(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        printnto1(num);
    }
}
