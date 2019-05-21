package com.ranj;

public class CharAndBoolean {

    public static void testCharAndBoolean() {
        // can store only one character. Can also store unicode characters
        // width is 16 (IMP: char is 2 bytes)
        //
        // char in java is 2 bytes as opposed to C which is 1 byte!
        // In Java, a character is encoded in UTF-16 which uses 2 bytes,
        // while a normal C string is more or less just a bunch of bytes

        char myChar = 'c';
        char myUnicodeChar = '\u00A9';
        System.out.println("Character is " + myChar + " and Unicode Char is " + myUnicodeChar);

        //
        boolean val = true;
        System.out.println("My Boolean is " + val + ", its negation is " + !val);
    }
}

/* OP:
Character is c and Unicode Char is ©
My Boolean is true, its negation is false
 */