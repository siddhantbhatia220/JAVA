package com.SiddhantBhatia.JAVA_II.RECURSION;

import java.util.*;

public class ProductOfDigits {
    public static int productdigit(int num){
        if(num==0){
            return 1;
        }
        return num%10*productdigit(num/10);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("Product of digits : "+productdigit(num));
    }
}
