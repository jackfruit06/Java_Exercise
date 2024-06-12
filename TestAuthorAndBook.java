package com.hus.oop.exercise02;
//Exercise 2.2 The Author and Book Classes Again - An Array ofObjects as an Instance Variable
public class TestAuthorAndBook {
    public static void main(String[] args) {
        Author ahTeck = new Author("Tan Ah Teck", "ahteck@nowhere.com", 'm');
        System.out.println(ahTeck); // Author’s toString(
        Author[] authors = new Author[2];
        authors[0] = new Author("Tan Ah Tec", "AhTeck@somewhere.com", 'm');
        authors[1] = new Author("Paul Tan", "Paul@nowhere.com", 'm');

        Book dummyBook = new Book("Java for dummy", authors, 19.95, 99);
        // Test Book's Constructor
        System.out.println(dummyBook); // Test Book’s toString()
        // Test Getters and Setters
        dummyBook.setPrice(29.95);
        dummyBook.setQty(28);
        System.out.println("name is : " + dummyBook.getName());
        System.out.println("price is : " + dummyBook.getPrice());
        System.out.println("qty is : " + dummyBook.getQty());
    }
}
