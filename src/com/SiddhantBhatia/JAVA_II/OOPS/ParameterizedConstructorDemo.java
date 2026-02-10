package com.SiddhantBhatia.JAVA_II.OOPS;

public class ParameterizedConstructorDemo {
    String name ;
    int x;
    ParameterizedConstructorDemo(){
        System.out.println("I am in non-parameterized constructor");
    }
    ParameterizedConstructorDemo(String name , int x){
        this.name = name;
        this.x = x;
        System.out.println("I am in parameterized constructor");
        System.out.println("Name : "+name +" , "+ "Roll no. : "+x);
    }
    public static void main(String[] args) {
        ParameterizedConstructorDemo cb1 = new ParameterizedConstructorDemo();
        ParameterizedConstructorDemo cb2 = new ParameterizedConstructorDemo("Siddhant Bhatia" , 713);
    }
}
