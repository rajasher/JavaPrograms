package com.ranj;

public class FloatAndDouble {

    // Converts pounds to kilograms
    private static void lbToKg(double pounds) {
        double kilo = pounds * 0.45_359_237;
        System.out.println(pounds + " Pounds is " + kilo + " Kilos ");
    }

    public static void testFloatsAndDoubles() {

        // float - 7 digit precision, double - 16 digit precision
        // double is faster on some of the modern day computers
        float myFloat = 5/3f;
        double myDouble = 5/3d; // by default java assumes the decimal number to be double)
        System.out.println("my float: " + myFloat);
        System.out.println("my double: " + myDouble);

        // Convert pounds to kilograms
        lbToKg(5);
    }
}

/*
my float: 1.6666666
my double: 1.6666666666666667
5.0 Pounds is 2.2679618500000003 Kilos
 */