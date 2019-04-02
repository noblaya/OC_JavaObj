package com.tfi.OC_JavaObj.shop;

public class Fridge extends Product{
    private int liter = 0;
    private boolean freezer = true;

    public Fridge(String name, String description, Double price, Integer liter, Boolean freezer) {
        super(name, description, price);
        this.liter = liter;
        this.freezer = freezer;
    }

    public int getLiter() {
        return liter;
    }

    public boolean isFreezer() {
        return freezer;
    }
}
