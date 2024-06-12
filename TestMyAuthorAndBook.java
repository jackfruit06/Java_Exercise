package com.hus.oop.exercise02;
//Exercise 2.3 The Author and Book Classes - Your Turn
public class TestMyAuthorAndBook {
    public static void main(String[] args) {

        // Test Author c l a s s
        MyAuthor author1 = new MyAuthor("Tan Ah Teck", "ahteck@nowhere.com");
        System.out.println(author1);
        author1.setEmail("ahteck @somewhere.com");
        System.out.println(author1);
        System.out.println("name is : " + author1.getName());
        System.out.println("email is : " + author1.getEmail());

// Test Book c l a s s
        MyBook book1 = new MyBook("12345" , "Java for dummies" , author1, 8.8, 88);
        System.out.println(book1);
        book1.setPrice(9.9);
        book1.setQty(99);
        System.out.println(book1);
        System.out.println("isbn is : " + book1.getName());
        System.out.println("name is : " + book1.getName());
        System.out.println("price is : " + book1.getPrice());
        System.out.println("qty is : " + book1.getQty());
        System.out.println("author is : " + book1.getAuthor() ); // Author’s toString()
        System.out.println("author’s name : " + book1.getAuthorName());
        System.out.println("author’s name: " + book1.getAuthor().getName());
        System.out.println("author’s email: " + book1.getAuthor().getEmail());
    }
}
