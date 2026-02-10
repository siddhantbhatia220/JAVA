package com.SiddhantBhatia.JAVA_II.OOPS;

public class Rectangle {
    int length;
    int breadth;
    public Rectangle(int length , int breadth){
        this.length = length;
        this.breadth = breadth;
    }
    public int calculatearea(){
        return length*breadth;
    }
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(20 , 10);
        System.out.println("Area of Rectangle is : "+r1.calculatearea());
    }
}
