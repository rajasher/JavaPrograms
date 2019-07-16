package com.composition;

public class Main {

    public static void main (String[] args) {

        Resolution resolution = new Resolution(2540, 1450);
        Monitor monitor = new Monitor("27inchBeast","Acer", 27, resolution);

        Dimensions dimensions = new Dimensions(15, 20, 5);
        Case theCase = new Case("dell-xl", "Dell", dimensions, "240v");

        Motherboard motherboard = new Motherboard("83-al", "Asus", 4, 2, "v3.1");

        PC mypc = new PC(theCase, monitor, motherboard);
        mypc.getMonitor().drawPixel(100, 200, "green");
        mypc.getMotherboard().loadProgram("Firmware");

    }
}
