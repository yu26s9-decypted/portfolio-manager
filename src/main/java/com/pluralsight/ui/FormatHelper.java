package com.pluralsight.ui;

import com.pluralsight.finance.IValuable;
import com.pluralsight.finance.Portfolio;

public class FormatHelper {

    public static void formatHelperHeader(){
        System.out.println("-".repeat(120));
        System.out.printf("%-15s %-15s\n",
                "ASSET NAME",
                "ASSET VALUE"

        );
        System.out.println("-".repeat(120));
    }

    public static void formatHelperPortfolio(IValuable a){
        System.out.printf("%-15s %-15f %n",
                a.getName(),
                a.getValue());
    }
}
