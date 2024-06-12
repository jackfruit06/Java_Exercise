package com.hus.oop.exercise02;

class Account {
    private int id;
    private CustomerAndAccount customer;
    private double balance = 0.0;

    public Account(int id, CustomerAndAccount customer, double balance) {
        this.id = id;
        this.customer = customer;
        this.balance = balance;
    }

    public Account(int id, CustomerAndAccount customer) {
        this.id = id;
        this.customer = customer;
    }

    public int getID() {
        return id;
    }

    public CustomerAndAccount getCustomer1() {
        return customer;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double bal) {
        this.balance = bal;
    }

    public String toString() {
        return customer.toString() + " balance = " + Math.round(balance * 100.0) / 100.0;
    }

    public Account deposit(double amount) {
        balance += amount;
        return this;
    }

    public Account withDraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            return this;
        } else {
            System.out.println("amount withdrawn exceeds the current balance");
            return this;
        }
    }
}
