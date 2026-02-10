package com.SiddhantBhatia.JAVA_II.RECURSION;

import java.util.*;
public class CoinToss {
    public static void cointoss(int n,String ans){
        if(n==0){
            System.out.print(ans);
            return;
        }
        cointoss(n - 1 , ans +"H");
        cointoss(n - 1 , ans+ "T");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        cointoss(n," ");
    }
}
