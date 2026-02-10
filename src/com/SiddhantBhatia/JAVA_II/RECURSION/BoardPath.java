package com.SiddhantBhatia.JAVA_II.RECURSION;

import java.util.*;
public class  BoardPath {
    public static void boardpath(int curr , int dest , String ans){
        if(curr == dest){
            System.out.println(ans);
            return;
        }
        if(curr > dest) return;
        for(int dice = 1 ; dice <=6;dice++){
            boardpath(curr+dice,dest,ans+dice);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dest = sc.nextInt();
        boardpath(0,dest," ");
    }
}
