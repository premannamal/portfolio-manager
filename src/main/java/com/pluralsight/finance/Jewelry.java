package com.pluralsight.finance;

public class Jewelry extends FixedAsset {
    private double karat;

    public Jewelry(String name, double karat) {
        super(name, 0.0);
        this.karat = karat;
    }

    @Override
    public double getValue() {
        // Example valuation logic based on karat
        return karat * 50.0;
    }

}
