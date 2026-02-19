package com.SiddhantBhatia.JAVA_II.OOPS;

public class Student {
        private int rollNo;
        public String name;
        public Student(int rollNo, String name) {
               this.rollNo = rollNo;
               this.name = name;
        }
        public Student(){

        }

    public void setRollNo(int rollNo){
        this.rollNo = rollNo;
    }
    public int getRollNo(){
        return rollNo;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setRollNo(713);

        Student s2 = new Student(663, "Siddhant");

        System.out.println("S1 Roll No: " + s1.getRollNo());
        System.out.println("S2 Name: " + s2.getName()+", S2 Roll No : "+s2.rollNo );

    }
}
