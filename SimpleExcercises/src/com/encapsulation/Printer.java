package com.encapsulation;

/*
        // Create a class and demonstate proper encapsulation techniques
        // the class will be called Printer
        // It will simulate a real Computer Printer
        // It should have fields for the toner Level, number of pages printed, and
        // also whether its a duplex printer (capable of printing on both sides of the paper).
        // Add methods to fill up the toner (up to a maximum of 100%), another method to
        // simulate printing a page (which should increase the number of pages printed).
        // Decide on the scope, whether to use constructors, and anything else you think is needed.
 */
public class Printer {

    private int tonerLevel;
    private int numPagesPrinted;
    private boolean isDuplex;

    public Printer(int tonerLevel, boolean isDuplex) {
        this.tonerLevel = -1;
        if (tonerLevel >= 0 && tonerLevel <=100)
            this.tonerLevel = tonerLevel;
        this.numPagesPrinted = 0;
        this.isDuplex = isDuplex;
    }

    public int fillToner(int tonerLevel) {
        if (tonerLevel <= 0 && tonerLevel > 100) {
            return -1;
        } else if (this.tonerLevel + tonerLevel > 100) {
            return -1;
        } else {
            this.tonerLevel += tonerLevel;
            return this.tonerLevel;
        }
     }

    public void printPages(int pages) {
        if (this.tonerLevel <= 0 || pages <= 0)
            return;
        if (this.isDuplex) {
            this.numPagesPrinted += Math.ceil(pages/2.0);
        } else {
            this.numPagesPrinted += pages;
        }
    }

    public int getNumPagesPrinted() {
        return this.numPagesPrinted;
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public void setDuplex(boolean duplex) {
        this.isDuplex = duplex;
    }
}
