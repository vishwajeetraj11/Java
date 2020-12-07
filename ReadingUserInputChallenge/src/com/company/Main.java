package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        System.out.println("Enter 10 Numbers: ");
        int i = 0;
        while(i<10) {
            System.out.println("Enter "+Math.round(i+1)+" no.");
            boolean hasNextInt = scanner.hasNextInt();
            if(hasNextInt){
                int number = scanner.nextInt();
                sum += number;
                i++;
            }else {
                System.out.println("Invalid Number.");
                break;
            }
            scanner.nextLine(); // handle end of line enter key

        }
        System.out.println("Sum of "+i+" numbers = "+sum);

        scanner.close();
    }
}
