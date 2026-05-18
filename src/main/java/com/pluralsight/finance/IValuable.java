package com.pluralsight.finance;

public interface IValuable {
    public default double getValue(){
        return 0;
    }
}




