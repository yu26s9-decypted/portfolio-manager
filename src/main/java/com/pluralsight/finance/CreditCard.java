package com.pluralsight.finance;

public class CreditCard implements IValuable {
    String name;
    String accountNumber;
    double balance;

    public CreditCard(String name, String accountNumber, double balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public double charge(double amount){
        return amount;
    }

    public double pay(double amount){
        return amount;
    }

    public double getValue(){
        return balance;
    }
}
