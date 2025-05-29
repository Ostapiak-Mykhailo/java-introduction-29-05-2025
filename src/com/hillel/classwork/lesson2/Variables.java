package com.hillel.classwork.lesson2;

public class Variables {

    public static void main(String[] args) {

        byte myByte = 112;
        System.out.println("This is BYTE: " + myByte);

        short myShort = 30000;
        System.out.println(myShort);

        int result = myByte + myShort;
        System.out.println(result);

        int myInt = 259878995;
        System.out.println(myInt);

        long myLong = 100_000_000_000L;
        System.out.println(myLong);

        float myFloat = 145.875F;
        System.out.println(myFloat);

        double myDouble = 1559865.2223657001;
        System.out.println(myDouble);

        boolean isValid = false;
        System.out.println(isValid);

        char myChar = '%';
        System.out.println(myChar);

        char myNumericChar = 56756;
        System.out.println(myNumericChar);

        char ch3 = '\u0054';
        System.out.println(ch3);

        String string = "test";
        System.out.println("This is STRING: " + string);

    }
}
