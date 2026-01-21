package com.SiddhantBhatia.JAVA_II.RECURSION;

import java.util.*;
public class CountDown {
    public static void countdown(int n){
        if(n==0) {
            System.out.println("0");
            return;
        }
        System.out.println(n);
        countdown(n-1);
    }
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        countdown(n);
    }
}
