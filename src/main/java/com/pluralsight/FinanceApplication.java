package com.pluralsight;

import com.pluralsight.finance.BankAccount;
import com.pluralsight.finance.Gold;
import com.pluralsight.finance.IValuable;
import com.pluralsight.finance.Portfolio;

import java.util.ArrayList;
import java.util.List;


public class FinanceApplication {
     static void main(String[] args){
        BankAccount account1 = new BankAccount("123", "Pam", 12500);
        List<IValuable> asset = new ArrayList<>();

        asset.add(new BankAccount("455", "SoFi National", 25024));
        asset.add(new Gold("Andys Gold", 450, 12));

        Portfolio p = new Portfolio("Andy's Portfolio", "Andy", asset);

        double portfolioVal = p.getValue();
         System.out.println(p);

         System.out.printf("Portfolio Value: $%,.2f", portfolioVal);




    }
}
