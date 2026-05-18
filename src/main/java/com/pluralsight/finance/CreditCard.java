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
        return balance - amount;
    }

    public double pay(double amount){
        return balance + amount;
    }

    public double getValue(){
        return -balance;
    }

    public String getName(){
        return name;
    }

    @Override
    public String toString() {
        return "CreditCard{" +
                "name='" + name + '\'' +
                ", accountNumber='" + accountNumber + '\'' +
                ", balance=" + balance +
                '}';
    }
}
