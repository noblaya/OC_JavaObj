package com.tfi.OC_JavaObj.shop;

public class Product {
    protected String name = "";
    protected String description = "";
    protected double price = 0.0;

    public Product(String name, String description, Double price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }
    /**
     * Display a full description of the product
     */
    public void look() {
        System.out.println(String.format(name + " : " + price + "%n" + description));
    }

    /**
     * Add the product to a bill
     * @param bill The concerned bill
     * @param quantity The quantity of product to add
     */
    public void buy(Bill bill, Integer quantity){

    }

    public String getName() {
        return name;
    }
    public String getDescription() {
        return description;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price){
        this.price = price;
    }

}
