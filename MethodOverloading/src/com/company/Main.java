package com.company;
/*
Method Overloading:
Making same named functions with different arguments

Method overloading is a feature that allows us to have more than one method with the same name, so,

It improves code readability and re-usability.
It is easier to remember one method name instead of remembering multiple names.
Achieves consistency in naming. One name for methods that are commonly used for example println.

Overloaded methods give programmers the flexibility to call a similar method with different types of data.
* */
public class Main {

    public static void main(String[] args) {
	    int newScore = calculateScore("Tin Tin", 500);
        System.out.println("New score is "+ newScore);
        System.out.println("New score is "+ calculateScore(43));
        calcFeetAndInchesToCentimeters(6,0);
        calcFeetAndInchesToCentimeters(157);
    }

    public static int calculateScore(String playerName, int score){
        System.out.println("Player "+playerName+" scored "+score+ " points.");
        return score * 1000;
    }
    public static int calculateScore(int score){
        System.out.println("Player - Vishwajeet Raj "+" scored "+score+ " points.");
        return score * 1000;
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if(feet < 0 || (inches < 0 && inches > 12) ) return -1;
        // 1 foot = 12 inch; 1 inch = 2.54cm
        double centimeters = (feet * 12) * 2.54;
        centimeters += inches*2.54;
        System.out.println(feet+" feet, "+inches+" inches = "+ centimeters+ " cm." );
        return centimeters;
    }

    public static double calcFeetAndInchesToCentimeters(double inches){
        if(inches >= 0) {
            // inches to foot
            double feet = (int) inches / 12;
            double remainingInches = (int) inches % 12;
            System.out.println(inches+" inches is equals to + "+feet+" feet and "+remainingInches+" inches.");
            return calcFeetAndInchesToCentimeters(feet, remainingInches);
        } else {
            return  -1;
        }
    }

}
