package com.hus.oop.exercise01;

public class TestInvoiceItem {
    public static void main(String[] args) {
        InvoiceItem inv1 = new InvoiceItem("A101", "Pen Red", 888, 0.08);
        System.out.println(inv1); // toString();
        inv1.setQty(999);
        inv1.setUnitPrice(0.99);
        System.out.println(inv1); // t o S t ri n g ( ) ;
        System.out.println("id is : " + inv1.getID());
        System.out.println("desc is: " + inv1.getDesc());
        System.out.println(" qty is : " + inv1.getQty());
        System.out.println("unitPrice is : " + inv1.getUnitPrice());
        // Test getTotal()
        System.out.println("The total is : " + inv1.getTotal());
    }


}
