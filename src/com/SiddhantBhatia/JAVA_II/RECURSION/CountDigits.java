package com.SiddhantBhatia.JAVA_II.RECURSION;

import java.util.*;

public class CountDigits {
    public static int countdigits(int n){
        if(n==0){
            return 1;
        }
        if(n>=1 && n<=9){
            return 1;
        }
        return 1+countdigits(n/10);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(countdigits(n));
    }
}
