package com.SiddhantBhatia.JAVA_II.RECURSION;

import java.util.*;
public class SumOfDigits {
    static int Sum(int n){
        if(n==0) return 0;
        return n % 10 + Sum(n/10);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Sum of digits : "+Sum(n));
    }
}
