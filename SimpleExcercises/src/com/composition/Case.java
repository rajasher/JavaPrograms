package com.composition;

public class Case {

    private String model;
    private String manufacturer;
    private Dimensions dimensions;
    private String powerSupply;

    public Case(String model, String manufacturer, Dimensions dimensions, String powerSupply) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.dimensions = dimensions;
        this.powerSupply = powerSupply;
    }

    public void pressPowerButton() {
        System.out.println("power button pressed");
    }
}
