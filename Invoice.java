package com.hus.oop.exercise02;

public class Invoice {
        private int id;
        private Customer customer;
        private double amount;

        public Invoice(int id, Customer customer, double amount){
            this.id = id;
            this.customer = customer;
            this.amount = amount;
        }
        public int getId(){
            return id;
        }
        public Customer getCustomer(){
            return customer;
        }
        public void setCustomer(Customer cus1){
            this.customer =cus1;
        }
        public double getAmount(){
            return amount;
        }
        public void setAmount(double amount1){
            this.amount = amount1;
        }
        public int getCustomerID(){
            return customer.getId();
        }
        public String getCustomerName(){
            return customer.getName();
        }
        public int getCustomerDiscount(){
            return customer.getDiscount();
        }
        public double getAmountAfterDiscount(){
            amount = amount*(1-getCustomerDiscount()*0.01);
            return amount;
        }
        public String toString(){
            return "Invoice[id = " + id + ", customer = " + customer + ", amount = " + amount +"]";
        }
}
