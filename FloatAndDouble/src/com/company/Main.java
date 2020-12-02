package com.company;

/*
Floating Point Numbers

Unlike whole numbers, floating point numbers have fractional parts that we express with a decimal point. 3.14159 is an example.

Floating point numbers are also know as real numbers. We use floating point number when we need more precision in calculations.

Single and Double Precision

Precision refers to the format and amount of space occupied by the type. Single precision occupies 32 bit (so has a width of 32) and a Double precision occupies 64 bits (and thus has a width of 64).

As a result the float has a range from 1.4E-45 to 3.4028235E+38 and the double is much more precise with a range from 4.9E-234 to 1.7976931348623157E+308

Float minimum value = 1.4E-45
Float maximum value = 3.4028235E38

Double minimum value = 4.9E-324
Double maximum value = 1.7976931348623157E308

By default, a floating point no. is double by Java.

Floating Point Number Precision Tips

In general float and double are great for general floating point operations.
But both are not great to use where precise calculations are required - this is due to a limitation with how floating point numbers are stored, and not a Java problem as such.

Java has a class called BigDecimal that overcomes this. For now, When precise calculations are necessary, such as when performing currency calculations, floating-point types should not be used.

But for general calculations float and double are fine.
* */
public class Main {

    public static void main(String[] args) {
    float myMinFloatValue = Float.MIN_VALUE;
    float myMaxFloatValue = Float.MAX_VALUE;
//        System.out.println("Float minimum value = " + myMinFloatValue);
//        System.out.println("Float maximum value = " + myMaxFloatValue);

        int myIntValue = 5/3;
        float myFloatValue = 5f/3f;
        double myDoubleValue = 5d/3d;

        System.out.println(myIntValue+" "+ myFloatValue+" "+ myDoubleValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
//        System.out.println("Double minimum value = " + myMinDoubleValue);
//        System.out.println("Double maximum value = " + myMaxDoubleValue);

        double Pounds = 200d;
        double Kilograms = Pounds * 0.453592;
        System.out.println(Kilograms);


    }
}

