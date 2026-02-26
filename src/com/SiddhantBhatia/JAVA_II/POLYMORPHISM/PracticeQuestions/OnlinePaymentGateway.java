package com.SiddhantBhatia.JAVA_II.POLYMORPHISM.PracticeQuestions;

import java.util.Scanner;

class Transaction{
    double amount;
    void setData(double amount){
        this.amount=amount;
    }
    double totalAmount(){
        return amount;
    }
}
class CreditCard extends Transaction{
    double totalAmount(){
        return amount + amount*0.03;
    }
}
class DebitCard extends Transaction{
    double totalAmount(){
        return amount + amount*0.02;
    }
}
class Upi extends Transaction{
    double totalAmount(){
        return amount + amount*0.01;
    }
}
public class OnlinePaymentGateway {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String paymentType = sc.next();
        double amount = sc.nextDouble();
        Transaction t;
        if (paymentType.equals("CreditCard"))
            t = new CreditCard();
        else if (paymentType.equals("DebitCard"))
            t = new DebitCard();
        else
            t = new Upi();
        t.setData(amount);
        System.out.print("Final Amount: " + t.totalAmount());
    }
}