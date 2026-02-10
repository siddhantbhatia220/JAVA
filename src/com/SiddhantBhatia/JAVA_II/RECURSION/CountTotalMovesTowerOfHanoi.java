package com.SiddhantBhatia.JAVA_II.RECURSION;

import java.sql.SQLOutput;
import java.util.*;
public class CountTotalMovesTowerOfHanoi {
    public static int totalmoves(int n) {
        if(n==0){
            return 0;
        }
        return 2*totalmoves(n-1)+1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Total moves of tower of hanoi : "+totalmoves(n));
    }
}
