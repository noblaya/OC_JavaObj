package com.tfi.OC_JavaObj.Garage;

import java.util.ArrayList;
import java.util.List;

public class Car extends Vehicule{
    private int door;
    private double literPer100km;
    private String engine;
    private List<String> options = new ArrayList<String>();


    public Car(String description, String manufacturer, int speed, int year, String modelName, String color, int[] dimensions, int weight) {
        super(description, manufacturer, speed, year, modelName, color, dimensions, weight);

        this.door = door;
        this.literPer100km = literPer100km;
        this.engine = engine;
        this.options = options;
    }

    //Methods
    public void startHeadLights(){
        System.out.println("Ma " + getManufacturer() + " " + getModelName() + " " + engine + " a les feux allumé" + "%n");
    }
    public void stopHeadLights(){
        System.out.println("Ma " + getManufacturer() + " " + getModelName() + " " + engine + " a les feux éteint" + "%n");
    }
    public void openTrunk() {
        System.out.println("J'ouvre le coffre de ma " + getManufacturer() + " " + getModelName() + "%n");
    }
    public void closeTrunk() {
        System.out.println( "Je ferme le coffre de ma " + getManufacturer() + " " + getModelName() + "%n");
    }

    @Override
    public void start(){
        System.out.println("Je suis une " + manufacturer + " " + modelName + ", je consomme " + literPer100km + " " + " et je démarre mon " + engine + "." + "%n");
    }
    @Override
    public void stop(){
        System.out.println("Je suis une " + manufacturer + " " + modelName + ", je consomme " + literPer100km + " " + " et j'éteind mon " + engine + "." + "%n");
    }

    //Getters
    public int getDoor() {
        return door;
    }

    public double getLiterPer100km() {
        return literPer100km;
    }

    public String getEngine() {
        return engine;
    }

    public List<String> getOptions() {
        return options;
    }
}
