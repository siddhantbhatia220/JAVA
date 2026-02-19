package com.SiddhantBhatia.JAVA_II.OOPS;

public class Constructor {
    int x;
    Constructor(){
        int y = 10;
        this(20);
        System.out.println(x);
        System.out.println(y);
    }
    Constructor(int z){
        this(z , "20");
        this.x = z;
        System.out.println(x);
        this.fun();
    }
    Constructor(int x , String y) {
    }
    void fun(){
        System.out.println("In fun method");
    }
    public static void main(String[] args) {
        Constructor c1 = new Constructor(10);
    }
}
