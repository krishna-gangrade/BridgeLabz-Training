package com.day2.mybank;

interface ITransaction {

    void deposit(double amount);
    void withdraw(double amount);
    double checkBalance();
}