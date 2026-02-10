package com.SiddhantBhatia.JAVA_II.RECURSION;

import java.util.*;

public class PalindromeCheck {
    public static int reverse(int num,int rev){
        if(num==0){
            return rev;
        }
        return reverse(num/10,rev*10+num%10);
    }
    public static boolean check(int num){
        return num == reverse(num,0);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.print(check(num));
    }
}
