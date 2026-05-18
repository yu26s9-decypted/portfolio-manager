package com.pluralsight.finance;

public class Jewelery extends FixedAsset {
    double karat;

    public Jewelery(String name, double marketValue, double karat) {
        super(name, marketValue);
        this.karat = karat;
    }

    public double getValue(){
        return karat * marketValue;
    }
    
    public String getName(){
        return name;
    }
}
