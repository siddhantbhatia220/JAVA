package com.SiddhantBhatia.JAVA_II.RECURSION;

import java.util.*;

public class PrintAllBinaryStrings {
    public static void printbinarystrings(int n , String ans){
        if(n==0){
            System.out.print(ans);
            return;
        }
        printbinarystrings(n-1,ans+'0');
        printbinarystrings(n-1,ans+'1');
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        printbinarystrings(n," ");
    }
}
