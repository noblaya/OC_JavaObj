package com.tfi.OC_JavaObj.Garage;

public abstract class Vehicule {
    protected String description;
    protected String manufacturer;
    protected int speed;
    protected int year;
    protected String modelName;
    protected String color;
    protected int[] dimensions = new int [3];
    protected int weight;

    public Vehicule(String description, String manufacturer, int speed, int year, String modelName, String color, int[] dimensions, int weight) {
        this.description = description;
        this.manufacturer = manufacturer;
        this.speed = speed;
        this.year = year;
        this.modelName = modelName;
        this.color = color;
        this.dimensions = dimensions;
        this.weight = weight;
    }

    //Methods
    public abstract void start();
    public abstract void stop();


    //Getters
    public String getDescription() {
        return description;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getSpeed() {
        return speed;
    }

    public int getYear() {
        return year;
    }

    public String getModelName() {
        return modelName;
    }

    public String getColor() {
        return color;
    }

    public int[] getDimensions() {
        return dimensions;
    }

    public int getWeight() {
        return weight;
    }
}
