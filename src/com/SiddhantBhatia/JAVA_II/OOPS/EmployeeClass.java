package com.SiddhantBhatia.JAVA_II.OOPS;

public class EmployeeClass {
    String name ;
    int id;
    double salary;
    public EmployeeClass(String name , int id , double salary){
        this.name = name;
        this.id  = id;
        this.salary = salary;
    }
    void printdetails(){
        System.out.println("Name : " + name);
        System.out.println("Id : " + id);
        System.out.print("salary : " + salary);
    }
    public static void main(String[] args) {
        EmployeeClass e1 = new EmployeeClass("Siddhant", 713 , 100000);
        e1.printdetails();
    }
}
