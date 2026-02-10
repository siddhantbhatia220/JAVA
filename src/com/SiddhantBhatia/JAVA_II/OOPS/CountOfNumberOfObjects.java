package com.SiddhantBhatia.JAVA_II.OOPS;

public class CountOfNumberOfObjects {
    static int count;
    int id;
    CountOfNumberOfObjects(int id){
        this.id = id;
        count++;
    }
    void printdetails(){
        System.out.println("Id : "+id);
    }
    public static void main(String[] args) {
        CountOfNumberOfObjects c1 = new CountOfNumberOfObjects(663);
        CountOfNumberOfObjects c2 = new CountOfNumberOfObjects(688);
        CountOfNumberOfObjects c3 = new CountOfNumberOfObjects(713);
        CountOfNumberOfObjects c4 = new CountOfNumberOfObjects(721);
        c1.printdetails();
        c2.printdetails();
        c3.printdetails();
        c4.printdetails();
//        System.out.println(CountOfNumberOfObjects.count);
        System.out.println(c1.count);
    }
}
