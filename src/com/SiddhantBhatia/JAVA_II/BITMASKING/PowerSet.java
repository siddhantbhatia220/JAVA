package com.SiddhantBhatia.JAVA_II.BITMASKING;

import java.util.Scanner;

public class PowerSet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char arr[] = new char [n];
        for(int i = 0 ; i<n ;i++){
            arr[i] = sc.next().charAt(0);
        }
        for(int i=0;i<(1<<n);i++){
            for(int j = 0 ; j < n ; j++){
                if((i&(1<<j))!=0){
                    System.out.println(arr[j]);
                }
            }
            System.out.println();
        }
    }
}
