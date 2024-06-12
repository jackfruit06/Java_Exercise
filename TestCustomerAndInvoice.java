package com.hus.oop.exercise02;
//Exercise 2.4 The Customer and Invoice Classes
public class TestCustomerAndInvoice {
    public static void main(String[] args) {
        //Test Customer class
        Customer customer1 = new Customer(88,"Nguyen Mai", 10);
        System.out.println(customer1); // Customer's toString

        customer1.setDiscount(8);
        System.out.println(customer1);
        System.out.println("id is: " + customer1.getId());
        System.out.println("name is: " + customer1.getName());
        System.out.println("discount is: " + customer1.getDiscount());

        // Test .Invoice class
        Invoice invoice2 = new Invoice(101, customer1, 888.8);
        System.out.println(invoice2);

        invoice2.setAmount(999.9);
        System.out.println(invoice2);
        System.out.println("id is: " + invoice2.getCustomerID());
        System.out.println("customer is: "+ invoice2.getCustomer());//Customer's toString
        System.out.println("amount is: " + invoice2.getAmount());
        System.out.println("customer's id is: " + invoice2.getCustomerID());
        System.out.println("customer's name is: " + invoice2.getCustomerName());
        System.out.println("customer's discount is: "+ invoice2.getCustomerDiscount());
        System.out.printf("amount after discount is: %.2f\n", invoice2.getAmountAfterDiscount());
    }
}
