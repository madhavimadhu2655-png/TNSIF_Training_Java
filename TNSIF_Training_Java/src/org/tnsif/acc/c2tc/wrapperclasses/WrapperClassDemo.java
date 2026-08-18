package org.tnsif.acc.c2tc.wrapperclasses;


public class WrapperClassDemo {
    public static void main(String[] args) {

        // BYTE
        byte primitiveByte = 1;
        Byte wrapperByte = primitiveByte;       // Autoboxing
        System.out.println(wrapperByte);

        byte unboxByte = wrapperByte;            // Unboxing
        System.out.println(unboxByte);


        // SHORT
        short primitiveShort = 2;
        Short wrapperShort = primitiveShort;     // Autoboxing
        System.out.println(wrapperShort);

        short unboxShort = wrapperShort;         // Unboxing
        System.out.println(unboxShort);


        // INT
        int primitiveInt = 3;
        Integer wrapperInt = primitiveInt;       // Autoboxing
        System.out.println(wrapperInt);

        int unboxInt = wrapperInt;               // Unboxing
        System.out.println(unboxInt);


        // LONG
        long primitiveLong = 4L;
        Long wrapperLong = primitiveLong;        // Autoboxing
        System.out.println(wrapperLong);

        long unboxLong = wrapperLong;             // Unboxing
        System.out.println(unboxLong);


        // FLOAT
        float primitiveFloat = 5.5f;
        Float wrapperFloat = primitiveFloat;     // Autoboxing
        System.out.println(wrapperFloat);

        float unboxFloat = wrapperFloat;         // Unboxing
        System.out.println(unboxFloat);


        // DOUBLE
        double primitiveDouble = 6.6;
        Double wrapperDouble = primitiveDouble;  // Autoboxing
        System.out.println(wrapperDouble);

        double unboxDouble = wrapperDouble;      // Unboxing
        System.out.println(unboxDouble);


        // CHAR
        char primitiveChar = 'A';
        Character wrapperChar = primitiveChar;   // Autoboxing
        System.out.println(wrapperChar);

        char unboxChar = wrapperChar;            // Unboxing
        System.out.println(unboxChar);


        // BOOLEAN
        boolean primitiveBoolean = true;
        Boolean wrapperBoolean = primitiveBoolean; // Autoboxing
        System.out.println(wrapperBoolean);

        boolean unboxBoolean = wrapperBoolean;      // Unboxing
        System.out.println(unboxBoolean);
    }
}