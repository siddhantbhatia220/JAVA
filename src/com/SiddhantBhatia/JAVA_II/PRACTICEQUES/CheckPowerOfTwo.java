package com.SiddhantBhatia.JAVA_II.PRACTICEQUES;

import java.util.*;

public class CheckPowerOfTwo {
    public static boolean checkpower(int n){
        return n>0 && (n&(n-1))==0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        System.out.println(checkpower(n));

    }
}
