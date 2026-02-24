package com.SiddhantBhatia.JAVA_II.POLYMORPHISM;

class A {
    int x = 30;                 // instance variable of parent class
    void gun() {
        System.out.println("In gun");   // normal method of parent
    }
    void run() {
        System.out.println("In parent run");   // method that can be overridden
    }
    void fun() {
        System.out.println("In A fun"); // parent version of fun()
        x = 20;                         // modifying parent variable
    }
    void sample() {
        System.out.println(x);   // prints current value of x
    }
}
class B extends A {
    void run() {
        System.out.println("In child run");   // method overriding (runtime polymorphism)
    }
    void fun() {
        System.out.println("In B fun");   // overriding fun() of parent
        super.fun();// calls A's fun()
        System.out.println(super.x);  // prints parent variable x
    }
    public static void main(String[] args) {
        // A obj = new B();        // upcasting → parent reference, child object
        // B obj2 = (B) obj;       // downcasting → explicit typecasting required
        B obj = new B();          // creating child object
        obj.fun();                // calls B's fun() (overridden method → runtime binding)
        obj.gun();                // inherited method from parent A
        obj.sample();             // prints value of x (30 because fun() of B doesn't change it)
    }
}