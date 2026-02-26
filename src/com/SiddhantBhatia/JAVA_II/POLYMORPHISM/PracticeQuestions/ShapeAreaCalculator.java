package com.SiddhantBhatia.JAVA_II.POLYMORPHISM.PracticeQuestions;

import java.util.Scanner;

class AreaCalculator {
    // Area of Circle
    double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }
    // Area of Rectangle
    double calculateArea(double length, double breadth) {
        return length * breadth;
    }
    // Area of Triangle
    double calculateArea(double base, double height, boolean isTriangle) {
        return 0.5 * base * height;
    }
}
public class ShapeAreaCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AreaCalculator calc = new AreaCalculator();
        String shape = sc.next();
        if (shape.equalsIgnoreCase("Circle")) {
            double radius = sc.nextDouble();
            System.out.printf("Area: %.2f", calc.calculateArea(radius));
        }
        else if (shape.equalsIgnoreCase("Rectangle")) {
            double length = sc.nextDouble();
            double breadth = sc.nextDouble();
            System.out.printf("Area: %.2f", calc.calculateArea(length, breadth));
        }
        else if (shape.equalsIgnoreCase("Triangle")) {
            double base = sc.nextDouble();
            double height = sc.nextDouble();
            System.out.printf("Area: %.2f", calc.calculateArea(base, height, true));
        }
    }
}