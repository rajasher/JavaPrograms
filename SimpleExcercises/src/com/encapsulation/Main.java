package com.encapsulation;

public class Main {

    public static void main(String[] args) {

        Printer printer = new Printer(50, true);
        printer.fillToner(20);
        printer.printPages(5);
        System.out.println("Number of pages printed : " + printer.getNumPagesPrinted());
        printer.setDuplex(false);
        printer.printPages(5);
        System.out.println("Number of pages printed : " + printer.getNumPagesPrinted());
    }
}
