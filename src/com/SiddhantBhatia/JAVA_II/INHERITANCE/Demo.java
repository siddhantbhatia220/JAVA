package com.SiddhantBhatia.JAVA_II.INHERITANCE;

class E {
    int x = 50;                 // parent variable
    void show() {
        System.out.println("In parent show");
    }
    void display() {
        System.out.println("In E display");
        x = 40;                 // modify parent variable
    }
    void print() {
        System.out.println(x);  // print parent variable
    }
}
class F extends E {
    int x = 100;                // child variable (hides parent variable)
    void show() {
        System.out.println("In child show");   // overriding parent method
    }
    void display() {
        System.out.println("In F display");
        super.display();        // call parent display()
        System.out.println(super.x); // access parent variable
    }
}
public class Demo {
    public static void main(String[] args) {
        F obj = new F();    // child object
        obj.display();      // child + parent method call
        obj.show();         // overridden method
        obj.print();        // prints parent x (40)
    }
}