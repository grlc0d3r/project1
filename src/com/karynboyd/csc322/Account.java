package com.karynboyd.csc322;

import java.util.Date;

public class Account {
    private int id = 0;
    private double balance = 0;
    private double annualInterestRate = .408;
    private Date dateCreated;

    public Account() {}

    public Account (int id, double balance, Date dateCreated) {
        this.id = id;
        this.balance = balance;
        this.dateCreated = dateCreated;
    }

    public int getID() { return id; }
    public void setID(int id) { this.id = id; }
    public double getBalance() { return balance; }
    public void setBalance(double balance) { this.balance = balance; }

    public double getMonthlyInterestRate() {
        double monthlyInterestRate = annualInterestRate / 12;
        return monthlyInterestRate;
    }

    public double withdraw(double amount) {
        if (amount <= balance) {
            balance = balance - amount;
            return amount;
        }
        else {
            
        }
    }
}
