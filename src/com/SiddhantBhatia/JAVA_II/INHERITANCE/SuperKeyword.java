package com.SiddhantBhatia.JAVA_II.INHERITANCE;

class C{
    int x = 10;
}

class D extends C{
    int x = 20;
    void show(){
        System.out.println(super.x);
    }
}

public class SuperKeyword {
    public static void main(String[] args) {
        D obj = new D();
        obj.show();
    }
}