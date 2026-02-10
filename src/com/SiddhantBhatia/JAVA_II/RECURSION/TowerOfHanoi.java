package com.SiddhantBhatia.JAVA_II.RECURSION;

import java.util.*;
public class TowerOfHanoi {
    public static void towerofhanoi(int n , char src , char helper , char destination){
        if(n==0){
            return ;
        }
        towerofhanoi(n-1,src,destination,helper);
        System.out.println("Move disk "+ n + " from "+ src + " to "+ destination);
        towerofhanoi(n-1,src,helper,destination);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        towerofhanoi(n,'A','B','C');
    }
}
