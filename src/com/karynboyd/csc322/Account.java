package com.karynboyd.csc322;

import java.util.Date;
import java.util.Scanner;

public class Account {
    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated;

    Scanner input = new Scanner(System.in);

    public Account() {
        this(0,100,0.25d);
        dateCreated = new Date();
    }

    public Account (int id, double balance, double annualInterestRate) {
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;

        dateCreated = new Date();
    }

    public int getID() { return id; }
    public void setID(int id) { this.id = id; }
    public double getBalance() { return balance; }
    public void setBalance(double balance) { this.balance = balance; }
    public double getAnnualInterestRate() { return annualInterestRate; }
    public void setAnnualInterestRate(double annualInterestRate ) { this.annualInterestRate = annualInterestRate;}
    public Date getDateCreate() { return dateCreated; }

    public double getMonthlyInterestRate() {
        double monthlyInterestRate = annualInterestRate / 1200;
        return monthlyInterestRate;
    }

    public double withdraw() {
        double amount;
        System.out.println("Enter withdrawal amount: ");
        amount = input.nextDouble();
        if (amount < balance) {
            balance = balance - amount;
        } else {
            System.out.println("Insufficient Funds.");
        }

        return amount;
    }

    public double deposit() {
        double amount = input.nextDouble();
        if (amount <= 0) {
            System.out.println("Invalid amount entered. Please try again.");
        } else {
            balance = balance + amount;
        }
        return amount;
    }

}
