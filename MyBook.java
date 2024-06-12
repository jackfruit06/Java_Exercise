package com.hus.oop.exercise02;
//Exercise 2.3
class MyBook {
    private String isbn;
    private String name;
    private MyAuthor author;
    private double price;
    private int qty = 0;

    public MyBook(String isbn, String name, MyAuthor author, double price) {
        this.isbn = isbn;
        this.name = name;
        this.author = author;
        this.price = price;
    }

    public MyBook(String isbn, String name, MyAuthor author, double price, int qty) {
        this.isbn = isbn;
        this.name = name;
        this.author = author;
        this.price = price;
        this.qty = qty;
    }

    public String getISBN() {
        return isbn;
    }

    public String getName() {
        return name;
    }

    public MyAuthor getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double newPrice) {
        this.price = newPrice;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int newQty) {
        this.qty = newQty;
    }

    public String getAuthorName() {
        return author.getName();
    }

    public String toString() {
        return "Book[isbn = " + isbn + ", name = " + name + ", Author [" + author.toString() + ", price = " + price + ", qty = " + qty + "]";
    }
}
