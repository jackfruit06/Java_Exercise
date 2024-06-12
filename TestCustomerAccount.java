package com.hus.oop.exercise02;
//Exercise 2.5 The Customer and Account Classes
public class TestCustomerAccount {
    public static void main(String[] args) {
        //Test Customer class
        CustomerAndAccount customer = new CustomerAndAccount(38, "Nguyen Mai", 'f');
        System.out.println(customer); // Customer's toString

        System.out.println("id is: " + customer.getID());
        System.out.println("name is: " + customer.getName());
        System.out.println("gender is: " + customer.getGender());

        // Test Account class
        Account account1 = new Account(101, customer, 888.9);
        System.out.println(account1);

        account1.setBalance(999.8);
        System.out.println(account1);
        System.out.println("id is: " + account1.getID());
        System.out.println("customer is: " + account1.getCustomer1());//Customer's toString
        System.out.println("balance is: " + account1.getBalance());
        System.out.println("customer's balance after deposited is: " + account1.deposit(100000.2));
        System.out.println("customer's balance after withdraw is: " + account1.withDraw(100000.2));
    }
}
