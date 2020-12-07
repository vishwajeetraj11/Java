package com.company;

import java.lang.invoke.ConstantBootstraps;

public class Customer {
    private int accountNumber;
    private double balance;
    private String name;
    private String email;
    private String  phoneNumber;

    public Customer(String name, String email, String phoneNumber) {
        this(99999, 100.55, name, email, phoneNumber);
    }

    public Customer() {
        this(43422, 2.50, "DefaultName", "defaultEmail@email.com", "default Phone Number");
        System.out.println("Constructor Invoked");

    }

    public Customer(int accountNumber, double balance, String name, String email, String  phoneNumber) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }
    public void LogValues() {
        System.out.println("All Customer Properties: \n Account Number: "+this.accountNumber);
        System.out.println("Balance: "+this.balance);
        System.out.println("Name: "+this.name);
        System.out.println("Email: "+this.email);
        System.out.println("Phone Number: "+this.phoneNumber);
    }

    public void depositFunds(double funds) {
        this.balance += funds;
        System.out.println("Deposit of "+funds+" made. Current Balance = "+this.balance+".");
    }
    public void withdrawFunds(double funds) {
        if(this.balance - funds < 0) {
            System.out.println("You have insufficient funds");
        } else {
            balance -= funds;
            System.out.println("Withdrawal of "+funds+" made. Current balance :"+this.balance+".");
        }

    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
