package com.polymorphism;

public class Main {

    public static void main(String[] args) {
        Car car = new Ford("Ford", 4);
        car.startEngine();
        car.acclerate();
        car.brake();
    }

}

class Car {

    private String name;
    private boolean engine;
    private int numCylinders;
    private int numWheels;

    public Car(String name, int cylinders) {
        this.name = name;
        this.numCylinders = cylinders;
        this.engine = true;
        this.numWheels = 4;
    }

    public void startEngine() {
        System.out.println("Car - Engine Started");
    }

    public void brake() {
        System.out.println("Car - Brake applied");
    }

    public void acclerate() {
        System.out.println("Car - Accelerated");
    }

    public String getName() {
        return name;
    }

    public boolean isEngine() {
        return engine;
    }

    public int getNumCylinders() {
        return numCylinders;
    }

    public int getNumWheels() {
        return numWheels;
    }

}

class Ford extends Car {

    public Ford(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public void startEngine() {
        System.out.println(getClass().getSimpleName() + " - Engine Started");
    }

    @Override
    public void brake() {
        System.out.println(getClass().getSimpleName() + " - Brake applied");
    }
}

