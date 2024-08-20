package com.bankingsystem;

public class Main {
    public static void main(String[] args) {
        BankLogin bankLogin = BankLogin.getInstance();
        BankAccount account = new BankAccount(1000.0);
        
        account.viewBalance();
        bankLogin.login();
        account.viewBalance();
        account.deposit(1000.0);
        account.withdraw(100.0);
        account.viewBalance();
        bankLogin.logout();
        account.viewBalance();
        account.deposit(1100.0);
    }
}