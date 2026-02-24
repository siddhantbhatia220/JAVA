package com.SiddhantBhatia.JAVA_II.OOPS;
//shallow copy : reference only , memory shared , not safe
//deep copy : new object , no memory share , safe
class Address{
    String city;
    Address(String city){
        this.city = city;
    }
}
public class Student2 {
    int rollNo;
    Address address;
    // Standard Constructor
    Student2(int rollNo , Address address){
        this.rollNo = rollNo;
        this.address = address;
    }
    //shallow copy constructor
//    Student2(Student2 s){
//        this.rollNo = s.rollNo;
//        this.address = s.address;
//    }
    //deep copy constructor
    Student2(Student2 s){
        this.rollNo = s.rollNo;
        this.address = new Address(s.address.city);//new object
    }

    public static void main(String[] args) {
        Address addr = new Address("Ambala Cantt");
        Student2 s1 = new Student2(1,addr);
        Student2 s2 =  new Student2(s1);
        s2.address.city = "Delhi";

    }
}
