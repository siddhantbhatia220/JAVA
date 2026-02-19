package com.SiddhantBhatia.JAVA_II.OOPS;

public class CopyConstructor {
    String name;
    int rollNo;
    CopyConstructor(int rollNo,String Name){
        this.rollNo = rollNo;
        this.name = name;
    }
    CopyConstructor(CopyConstructor c1){
        this.rollNo = c1.rollNo;
        this.name = c1.name;
    }
    public static void main(String[] args) {
        CopyConstructor c1 = new CopyConstructor(1,"Siddhant");
        CopyConstructor c2 = new CopyConstructor(c1);
    }
}
