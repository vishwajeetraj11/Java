package com.company;
/*
* Constructor Overloading
* */
public class Main {

    public static void main(String[] args) {
//	Customer Allen = new Customer();
//	Customer Allen = new Customer(683205924,440000,"Vishwajeet Raj", "vishwajeetraj11@gmail.com", "8507407214");
	Customer Allen = new Customer("Vishwajeet Raj", "vishwajeetraj11@gmail.com", "8507407214");
        System.out.println("******************** \n");
        Allen.LogValues();
        System.out.println("******************** \n");

        Allen.depositFunds(30000);
        Allen.withdrawFunds(2000);
        Allen.withdrawFunds(1000000);
        System.out.println(Allen.getBalance());


    }
}
