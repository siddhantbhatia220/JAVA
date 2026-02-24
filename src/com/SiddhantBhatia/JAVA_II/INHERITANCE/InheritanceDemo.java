package com.SiddhantBhatia.JAVA_II.INHERITANCE;

class A{
    A(){
        System.out.println("In Constructor A");
    }
    public static void main(String[] args) {
        System.out.println("In Class A");
//        B obj = new B();
//        obj.fun();
    }
}

class B extends A{
//    void fun(){
//        System.out.println("In B Fun");
//    }
    public static void main(String[] args) {
        System.out.println("In Class B");
        B obj = new B();//will find non static thing in parent class

    }
}
