package com.company;

import java.util.Scanner;
/*
System.out prints
System.in takes input
*/
public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your year of birth: ");
        // hasNextInt() => next input entered is a number in this case integer
        boolean hasNextInt = scanner.hasNextInt();

        if(hasNextInt) {
            int yearOfBirth = scanner.nextInt();

            // handle next line character (enter key)
            scanner.nextLine();

            System.out.println("Enter your name: ");
            String name = scanner.nextLine();


            int age = 2020 - yearOfBirth;
            if(age >= 0 && age <= 100) {
                System.out.println("Your name is : "+name+". Your Age is "+age+".");
            } else {
                System.out.println("Invalid Year of Birth");
            }

        } else {
            System.out.println("Unable to parse year of birth");
        }

        scanner.close();

    }
}
