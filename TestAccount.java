package com.hus.oop.exercise01;

public class TestAccount {
    public static void main(String[] args) {
        Account account1 = new Account( "A101" , "Tan Ah Teck" , 88 ) ;
        System.out.println(account1) ;
        Account account2 = new Account( "A102" , "Kumar" ) ; // default balance
        System.out.println(account2);
        // Test G e t t e r s
        System.out.println("ID : " + account1.getID());
        System.out.println("Name :"  + account1.getName());
        System.out.println("Balance : " + account1.getBalance());

// Test credit() and debit()
        account1.credit(100);
        System.out.println(account1);
        account1.debit(50);
        System.out.println(account1);
        account1.debit(500); // debit()error
        System.out.println(account1) ;

// Test transfer                            ()
        account1.transferTo(account2,100); // t o S t ri n g ( )
        System.out.println(account1);
        System.out.println(account2);
    }
}
