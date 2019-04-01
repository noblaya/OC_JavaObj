package com.tfi.OC_JavaObj;

public class Television extends Product {
    private int size;
    private String slabType;

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
