package com.pluralsight;

import com.pluralsight.finance.BankAccount;
import com.pluralsight.finance.IValuable;


public class FinanceApplication {
    public static void main(String[] args){
        BankAccount account1 = new BankAccount("123", "Pam", 12500);
//        Valuable account2 = new BankAccount(456, "Gary", 1500);
        IValuable account2 = new BankAccount("456", "Joe", 25839);

        account1.deposit(100);

        System.out.println(account1);
        System.out.println(account2);


    }
}
