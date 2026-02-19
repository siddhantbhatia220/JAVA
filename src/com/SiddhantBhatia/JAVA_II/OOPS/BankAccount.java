package com.SiddhantBhatia.JAVA_II.OOPS;

public class BankAccount {
    int balance;
    String name;
    BankAccount(int balance , String name ){
        this.balance = balance;
        this.name = name;
    }
    public  void withdraw(int amount){
        if(amount>balance){
            return ;
        }
        else{
            balance= balance -amount;
        }
    }
    public void deposit(int amount){
        if(amount <= 0){
            return ;
        }
        else{
            balance = balance+amount;
        }
    }
    public void details(){
        System.out.println("Name : "+name);
        System.out.println("balance : "+ balance);
    }
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount(100000,"Siddhant");
        b1.withdraw(10000);
        b1.deposit(5000);
        b1.details();
    }
}
