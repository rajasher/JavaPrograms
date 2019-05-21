package com.ranj;

public class ByteIntShort {

    public static void testByteIntShort() {
        // int is 32 bits wide (_ between digits is java 8 feature)
        int myInt = 2_147_483_647; // largest int that can be stored
        int myNewVal = (myInt/2);
        System.out.println("My new int: " + myNewVal);

        // short is 16 bits wide
        short myShort = 32767;
        // Note the cast. Without casting java converts into integer
        // Since integer is longer than short, conversion is needed here
        short myNewShort = (short)(myShort/2);
        System.out.println("My new short: " + myNewShort);

        // byte is 8 bits wide (1 byte)
        byte myByte = 127;

        // long is 64 bits wide
        long myLong = 9_223_372_036_854_775_807L; // largest long that can be stored
        long myNewLong = 50000L + (10 * (myInt + myByte + myShort));
        System.out.println("My new Long: " + myNewLong);
    }
}

/*
My new int: 1073741823
My new short: 16383
My new Long: 378930
 */