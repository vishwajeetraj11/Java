package com.company;
/*
 private - doesn't allow any class outside the current class to access the variable or method.
* */
public class Car {
    // private -> access modifier
    // generally always go with private
    private int doors;
    private int wheels;
    private String model;
    private String colour;
    private String engine;

    public void setModel(String model) {
        this.model = model;
    }

    public  String getModel() {
        return this.model;
    }
}
