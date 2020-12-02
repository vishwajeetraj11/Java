package com.company;

/*
Min Integer Value: -2147483648
Max Integer Value: 2147483647

Min Byte Value: -128
Max Byte Value: 127

Min Short Value: -32768
Max Short Value: 32767

Min Long Value: -9223372036854775808
Max Long Value: 9223372036854775807

Wrapper Class : Java uses the concept of a Wrapper class for all eight primitive types - In the case of an int,
we can use Integer, and by doing that it gives us ways to perform operations on an int.

In this case, we are using the MIN_VALUE and MAX_VALUE to get Java to tell us the minimum and maximum ranges of
numbers that can be stored.

Overflow and Underflow in Java
If you try and put a value larger than the maximum value in Java, or a value smaller than the minimum value in Java,
then you will get an Overflow in the case of the maximum value or an Underflow in the case of the minimum.
*

Size of Primitive Types and Width

A Byte occupies 8 bits. A bit is not directly represented in a primitive type.
So, a Byte occupies 8 bits. We say that a byte has a width of 8.

A short can store a large numbers and occupies 16 bits, and has a width of 16.
An int has a much larger range and occupies 32 bits, and has a width of 32.
The point here is that each primitive type occupies a different amount of memory

Casting
Casting means to treat or convert a number from one type to another. We put the type we want the number to be in
parentheses like this.
(byte)(myMinByteValue/2);

Default: Integer
*/

public class Main {

    public static void main(String[] args) {
        // Range:
        int MyMinIntValue = Integer.MIN_VALUE;
        int MyMaxIntValue = Integer.MAX_VALUE;
//        System.out.println("Min Integer Value: "+MyMinIntValue);
//        System.out.println("Max Integer Value: "+MyMaxIntValue);
//        System.out.println("Busted Max Integer Value: " + (MyMaxIntValue + 1));
        // Busted Max Integer Value: -2147483648 --Overflow

        byte MyMinByteValue = Byte.MIN_VALUE;
        byte MyMaxByteValue = Byte.MAX_VALUE;
//        System.out.println("Min Byte Value: "+MyMinByteValue);
//        System.out.println("Max Byte Value: "+MyMaxByteValue);

        short MyMinShortValue = Short.MIN_VALUE;
        short MyMaxShortValue = Short.MAX_VALUE;
//        System.out.println("Min Short Value: "+MyMinShortValue);
//        System.out.println("Max Short Value: "+MyMaxShortValue);

        long MyMinLongValue = Long.MIN_VALUE;
        long MyMaxLongValue = Long.MAX_VALUE;
//        System.out.println("Min Long Value: "+MyMinLongValue);
//        System.out.println("Max Long Value: "+MyMaxLongValue);

        // My Long Value -- put L in the end of number.
        // If L is not added at the end of the number then Java Treats
        // that value as Integer
        long myLongValue = 100L;
//        System.out.println(myLongValue);

        byte myNewByteValue = (byte)(MyMinByteValue / 2);

    }
}
