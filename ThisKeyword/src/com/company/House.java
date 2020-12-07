package com.company;
/*
 This keyword this is commonly used with constructors and setters, and optionally in getters (easier for beginners). In the example below we are using the this keyword in the constructor and setter since there is a parameter with the same name. In the getter we don't have any parameter so that this keyword is optional.
*/
public class House {
    private String color;

    public House(String color) {
        // this keyword is required, same parameter name as field
        this.color = color;
    }

    public String getColor() {
        // this is optional
        return color; // same as return this.color;
    }

    public void setColor(String color) {
        // this keyword is required, same parameter name as field
        this.color = color;
    }
}
