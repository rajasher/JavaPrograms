package com.carpetcostcalc;

public class Floor {

    private double width;
    private double length;

    public Floor(double width, double length) {
        this.width = 0;
        this.length = 0;
        if (width > 0)
            this.width = width;
        if (length > 0)
            this.length = length;
    }

    public double getArea() {
        return this.length * this.width;
    }
}
