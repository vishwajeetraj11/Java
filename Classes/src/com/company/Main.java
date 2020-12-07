package com.company;
/*
Objects -
*/
public class Main {

    public static void main(String[] args) {
        Car porsche = new Car();
        // Currently we don't have any methods in Car class still some methods are showing up? why ? java has added automatically
        System.out.println(porsche.getModel()); // null

        porsche.setModel("Carrera");

        System.out.println(porsche.getModel()); // model

    }
}
