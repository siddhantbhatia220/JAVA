package com.SiddhantBhatia.JAVA_II.ObjectClass;

class Student {
    int rollNo;
    String name;

    // Constructor to initialize values
    Student(int r, String n) {
        rollNo = r;
        name = n;
    }

    // Override toString() for custom object printing
    public String toString() {
        return rollNo + "\n" + name;
    }

    public static void main(String[] args) {

        // Create first student object
        Student s1 = new Student(713, "Siddhant");

        // New object (currently commented)
//       Student s2 = new Student(663 , "PulkitBoi");

        // s2 refers to the SAME object as s1 (reference copy)
        Student s2 = s1;

        // toString() is automatically called
        System.out.println(s1);
        System.out.println(s2);

        // String object comparison demo (commented)
//        String a = new String("Siddhant");
//        String b = new String("Siddhant");
//        System.out.println(a==b);           // compares reference
//        System.out.println(a.equals(b));    // compares value
//        System.out.println(a.hashCode());   // hash of content
//        System.out.println(b.hashCode());

        // Compare object references
        System.out.println(s1 == s2);        // true (same reference)

        // equals() not overridden → behaves like ==
        System.out.println(s1.equals(s2));   // true

//        System.out.println((s1.name).equals(s2.name));  //true

        // Default constructor example (commented)
//        Student s1 = new Student();
//        Student s2 = new Student();
//        Student s2 = s1;
//        System.out.println(s1);

        // Generic Object class example (commented)
//        Object obj = new Object();

        // String hashCode + content difference (commented)
//        String x = "Siddhant ";
//        String y = "Siddhant";
//        System.out.println(x);
//        System.out.println(y);
//        System.out.println(x.hashCode());
//        System.out.println(y.hashCode());

        // Printing object references (commented)
//        System.out.println(s1);
//        System.out.println(s2);

        // Primitive variables example (commented)
//        int a = 10;
//        int b = 20;
//        System.out.println(a);
    }
}