package com.SiddhantBhatia.JAVA_II.RECURSION;

import java.util.*;

public class CountNumberOfZeroes {
    public static int countzeroes(int num){
        if (num == 0) {  
            return 1;
        }
        if(num>=1&&num<=9){
            return 0;
        }
        if(num % 10 == 0){
            return 1+countzeroes(num/10);
        }
        else{
            return countzeroes(num/10);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("Count of Zeroes are : "+countzeroes(num));
    }
}
