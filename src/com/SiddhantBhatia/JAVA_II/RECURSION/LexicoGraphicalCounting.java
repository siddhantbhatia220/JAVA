package com.SiddhantBhatia.JAVA_II.RECURSION;

import java.util.*;

public class LexicoGraphicalCounting {
    public static void lexicographicalcounting(int curr , int n){
        if (curr>n){
            return;
        }
        System.out.print(curr+" ");
        for(int i = 0;i<=9;i++){
            lexicographicalcounting(curr*10+i , n);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1;i<=9;i++){
            lexicographicalcounting(i , n);
        }

    }
}
