package com.ranj;

public class Strings {

    // String is a sequencce of characters
    public static void testStrings() {

        String myStr = "Hello World!";
        System.out.println("My String is " + myStr);
        myStr = myStr + " I am here.";
        System.out.println("Concatenated String is " + myStr);
        myStr = myStr + "\u00A9 2019";
        System.out.println("Concatenated String is " + myStr);

        String newStr = "50";
        int myInt = 10;
        // Since we are storing the result in a string, java converts int to string and performs string operation
        newStr = newStr + myInt;
        System.out.println("Concatenated with int =" + newStr);
        double myDouble = 120.23;
        newStr += myDouble;
        System.out.println("Concatenated with double = " + newStr);
    }
}

/* o/p:
My String is Hello World!
Concatenated String is Hello World! I am here.
Concatenated String is Hello World! I am here.© 2019
Concatenated with int =5010
Concatenated with double = 5010120.23

Process finished with exit code 0
 */