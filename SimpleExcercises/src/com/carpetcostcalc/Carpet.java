package com.carpetcostcalc;

public class Carpet {

    private double cost;

    public Carpet(double cost) {
        this.cost = 0;
        if (cost > 0)
            this.cost = cost;
    }

    public double getCost() {
        return this.cost;
    }
}
