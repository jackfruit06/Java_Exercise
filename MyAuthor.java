package com.hus.oop.exercise02;
//Exercise 2.3
public class MyAuthor {
    private String name;
    private String email;
    public MyAuthor(String name, String email){
        this.name = name;
        this.email = email;
    }
    public String getName() {
        return name;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String newEmail){
        this.email = newEmail;
    }
    public String toString(){
        return "Author[name = " + name + ", email = " + email + "]";
    }
}
