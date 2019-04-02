package com.tfi.OC_JavaObj.shop;

import java.util.Map;

public class Bill {
    private Customer customer;
    private Map<Product, Integer> products;
    private Delivery delivery;

    public Bill(Customer customer, Delivery delivery){
        this.customer = customer;
    }

    /**
     * Add a product with a quantity in the bill
     * @param product product to add
     * @param quantity quantity of the product to add
     */
    public void addProduct(Product product, Integer quantity){
        this.products.put(product, quantity);
    }

    public Customer getCustomer() {
        return customer;
    }

    public Map<Product, Integer> getProducts() {
        return products;
    }

    public void generate(Writer writer) {

    }

    public double getTotal(){
        return 0;
    }
}
