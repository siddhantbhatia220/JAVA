package com.SiddhantBhatia.JAVA_II.RECURSION;

import java.util.Scanner;

public class Permutation {
    public static void permutation(String s,String ans){
        if(s.isEmpty()){  //s.length()==0
            System.out.print(ans);
            return;
        }
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            String rest = s.substring(0,i)+s.substring(i+1);
            permutation(rest,ans+ch);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        permutation(s," ");
    }
}