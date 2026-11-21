package com.pluralsight.finance;

public class House extends FixedAsset {
    private int yearBuilt;
    private int squareFeet;
    private int bedrooms;


    public House(int year, int squareFeet, int bedrooms) {
        super("House", 0.0);
        this.yearBuilt = year;
        this.squareFeet = squareFeet;
        this.bedrooms = bedrooms;
    }

    @Override
    public double getValue() {
        // Example valuation logic based on square footage and bedrooms
        return (squareFeet * 150.0) + (bedrooms * 10000.0);
    }

}
