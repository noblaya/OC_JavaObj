package com.tfi.OC_JavaObj.shop;

public class Television extends Product {
    private int size = 0;
    private String slabType = "";

    public Television(String name, String description, Double price, Integer size, String slabType) {
        super(name, description, price);
        this.size = size;
        this.slabType = slabType;
    }

    public int getSize() {
        return size;
    }

    public String getSlabType() {
        return slabType;
    }
}
