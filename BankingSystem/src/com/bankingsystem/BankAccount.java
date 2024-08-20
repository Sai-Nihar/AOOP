package com.bankingsystem;

public class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }
    public void viewBalance() {
        if (BankLogin.getInstance().isLoggedIn()) {
            System.out.println("Current balance: $" + balance);
        }
    }
    public void deposit(double amount) {
        if (BankLogin.getInstance().isLoggedIn()) {
            balance += amount;
            System.out.println("Deposited: $" + amount + ". New balance: $" + balance);
        } 
    }
    
    public void withdraw(double amount) {
        if (BankLogin.getInstance().isLoggedIn()) {
            if (amount <= balance) {
                balance -= amount;
                System.out.println("Withdrew $" + amount + ". New balance: $" + balance);
            } else {
            	System.out.println("Withdrew: $" + amount);
            	System.out.println("Insufficient funds.");
            }
        } else {
            System.out.println("Logging in to withdraw money.");
        }
    }
}