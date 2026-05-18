package com.pluralsight.finance;

import java.util.List;

public class Portfolio {
    String name;
    String owner;
    List<IValuable> asset;

    public Portfolio(String name, String owner, List<IValuable> asset) {
        this.name = name;
        this.owner = owner;
        this.asset = asset;
    }

    public void add(IValuable asset){
         this.asset.add(asset);
    }

    public String getAssetName(){
        return name;
    }

    public List<IValuable> getAssets() {
        return asset;
    }

    public double getValue(){
        double portfolioValue = 0;
        for(IValuable a: asset){

                portfolioValue += a.getValue();

        }
        return portfolioValue;
    }

    public String getMostValuableAssetName(){
        IValuable mostValuable = null;
        for(IValuable a : asset){
            if (mostValuable == null || a.getValue() > mostValuable.getValue()){
                mostValuable = a;
            }
        }
        return mostValuable != null ? mostValuable.getName() : "None";
    }

    public String getLeastValuableAssetName(){
        IValuable leastValuable = null;
        for(IValuable a : asset){
            if (leastValuable == null || a.getValue() < leastValuable.getValue()){
                leastValuable = a;
            }
        }
        return leastValuable != null ? leastValuable.getName() : "None";
    }

    public double getMostValuable(){
        double mostValuable = 0;
        for (IValuable a : asset){
            if (a.getValue() > mostValuable){
                mostValuable = a.getValue();
            }
        }
        return mostValuable;
    }

    public double getLeastValuable(){
        double leastValuable = 0;
        for(IValuable a : asset){
            leastValuable = getMostValuable();
            if(a.getValue() < leastValuable){
                leastValuable = a.getValue();
            }
        }
        return leastValuable;
    }

    @Override
    public String toString() {
        return String.format("%s Portfolio: Asset: %s ", name, asset);
    }
}
