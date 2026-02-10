package com.SiddhantBhatia.JAVA_II.RECURSION;

import java.util.*;
public class SubSequence {
    public static void subsequence(String s , String ans) {
        if (s.length()==0) {
            System.out.println(ans);
            return;
        }
        char ch = s.charAt(0);
        String rest = s.substring(1);
        subsequence(rest,ans);
        subsequence(rest,ans+ch);
    }
    public static void main(String[] args) {
            Scanner sc = new Scanner (System.in);
            String s = sc.nextLine();
            subsequence(s,"");
        }
    }


