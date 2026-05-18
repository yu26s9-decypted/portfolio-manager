package com.pluralsight;

import com.pluralsight.finance.*;
import com.pluralsight.ui.Console;
import com.pluralsight.ui.FormatHelper;

import java.util.ArrayList;
import java.util.List;

public class Main {
    static void main() {
        List<IValuable> asset = new ArrayList<>();
        Portfolio p = new Portfolio("Andy's Asset", "Andy", asset);
        p.add(new BankAccount("492944", "Credit Union", 42442));
        p.add(new CreditCard("Discover", "423422", 1500));
        boolean isRunning = true;

        while (isRunning) {

            String m = """
                    \nWelcome! What asset would you like to add to your portfolio?
                    1. Bank Account
                    2. Credit Card
                    3. Gold
                    4. Jewelery
                    5. House
                    6. View Portfolio
                    7. Portfolio Value
                    Enter your choice:""";

            int userChoice = Console.askForInt(m, 1, 10);

            switch (userChoice) {
                case 1 -> processAddAssetOfBankAccount(asset);
                case 2 -> processAddAssetOfCreditCard(asset);
                case 3 -> processAddAssetOfGold(asset);
                case 4 -> processAddJewelery(asset);
                case 5 -> processAddHouse(asset);
                case 6 -> processViewPortfolio(p);
                case 7 -> processPortfolioValue(p);
            }
        }
    }

    public static void processAddAssetOfBankAccount(List<IValuable> asset){
        String bankAccNumber = Console.askForString("What is the bank acc number");
        String bankAccName = Console.askForString("What is the bank acc name");
        double bankBalanace = Console.askForDouble("What is the amount in the bank");
        asset.add( new BankAccount(bankAccNumber, bankAccName, bankBalanace));

        System.out.printf("Done!" + asset);
    }

    public static void processAddAssetOfCreditCard(List<IValuable> asset){
        String creditAccNumber = Console.askForString("What is the credit acc number");
        String creditAccName = Console.askForString("What is the credit account name");
        double creditBalance = Console.askForDouble("What is the credit balance?");
        asset.add(new CreditCard(creditAccName, creditAccNumber, creditBalance));

        System.out.printf("Done!" + asset);
    }

    public static void processAddAssetOfGold(List<IValuable> asset){
        String name = Console.askForString("What is the name of this asset");
        double mv = Console.askForDouble("What is the market value of this asset");
        double weight = Console.askForDouble("What is the weight of the gold");
        asset.add(new Gold(name, mv, weight ));

        System.out.printf("Done!" + asset);
    }

    public static void processAddJewelery(List<IValuable> asset){
        String name = Console.askForString("What is the name of this asset");
        double mv = Console.askForDouble("What is the market value of this asset");
        double karat = Console.askForDouble("What is the karat of this jewelery");
        asset.add(new Jewelery(name, mv, karat));

        System.out.printf("Done!" + asset);
    }

    public static void processAddHouse(List<IValuable> asset){
        String name = Console.askForString("What is the name of this asset");
        double mv = Console.askForDouble("What is the market value of this asset");
        int y = Console.askForInt("What year is this house", 1900, 2026);
        int sq = Console.askForInt("What is the squarefeet of this house", 100, 100000);
        int bedrooms = Console.askForInt("How many bedrooms", 1, 20);
        asset.add(new House(name, mv, y, sq, bedrooms));

        System.out.printf("Done!" + asset);
    }


    public static void processViewPortfolio(Portfolio p){
        System.out.printf("%s Portfolio", p.getAssetName());
        FormatHelper.formatHelperHeader();
       for(IValuable a : p.getAssets()){
           FormatHelper.formatHelperPortfolio(a);
       }
    }

    public static void processPortfolioValue(Portfolio p){
        System.out.printf("Value of all your assets: $%,.2f \n Most Valuable %s is worth: $%,.2f", p.getValue(), p.getMostValuableAssetName(), p.getMostValuable());
        System.out.printf("Least valuable asset: %s $%,.2f",p.getLeastValuableAssetName(), p.getLeastValuable());

    }
}

