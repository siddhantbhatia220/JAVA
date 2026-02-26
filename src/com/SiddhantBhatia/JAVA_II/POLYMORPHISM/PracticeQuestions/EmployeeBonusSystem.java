package com.SiddhantBhatia.JAVA_II.POLYMORPHISM.PracticeQuestions;

import java.util.Scanner;

class Employee {
    int baseSalary;
    Employee(int baseSalary) {
        this.baseSalary = baseSalary;
    }
    int getSalary() {
        return baseSalary;
    }
}
class Manager extends Employee {
    int bonus;
    Manager(int baseSalary, int bonus) {
        super(baseSalary);
        this.bonus = bonus;
    }
    int getTotalSalary() {
        return super.getSalary() + bonus;
    }
}
public class EmployeeBonusSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int baseSalary = sc.nextInt();
        int bonus = sc.nextInt();
        Manager m = new Manager(baseSalary, bonus);
        System.out.println("Total Salary: " + m.getTotalSalary());
    }
}