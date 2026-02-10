package com.SiddhantBhatia.JAVA_II.RECURSION;

import java.util.*;
public class PowerOf {
    public static int power(int base, int power){
        if(power==0) return 1;
        return base*power(base,power-1);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int base = sc.nextInt();
        int power = sc.nextInt();
        System.out.println("Power : "+power(base,power));
    }
}
