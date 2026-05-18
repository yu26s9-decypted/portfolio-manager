package com.pluralsight.finance;

public class House extends FixedAsset {
    int yearBuilt;
    int squareFeet;
    int bedrooms;

    public House(String name, double marketValue, int yearBuilt, int squareFeet, int bedrooms) {
        super(name, marketValue);
        this.yearBuilt = yearBuilt;
        this.squareFeet = squareFeet;
        this.bedrooms = bedrooms;
    }

    public double getValue(){
        return 0;
    }
}
