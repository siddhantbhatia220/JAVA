package com.SiddhantBhatia.JAVA_II.PRACTICEQUES;

import java.util.*;

public class FindUniqueElement {
    public static void finduniqueele(int n , int [] arr){
        int ans = 0;
        for(int i = 0 ; i < n ; i++){
            ans = ans ^ arr[i];
        }
        System.out.println(ans);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }
        finduniqueele(n , arr);
    }
}
