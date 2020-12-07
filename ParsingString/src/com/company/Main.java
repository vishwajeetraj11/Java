package com.company;

public class Main {

    public static void main(String[] args) {
	String number = "2013.123";
        System.out.println("number as String: "+ number);

        double parsedStringtoDouble = Double.parseDouble(number);
        parsedStringtoDouble +=1;
        number += 1;
        System.out.println(number);

        System.out.println(parsedStringtoDouble);
    }
}
