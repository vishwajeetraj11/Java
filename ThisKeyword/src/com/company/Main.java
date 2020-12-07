package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        House house = new House("Pink");

        System.out.println(house.getColor());
        house.setColor("Orange");
        System.out.println(house.getColor());
    }
}
