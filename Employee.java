package com.hus.oop.exercise01;

public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private int salary;
    public Employee(int id, String firstName, String lastName, int salary){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public int getID(){
        return id;
    }

    public String getFirstName() {
        return firstName;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    public int getSalary() {
        return salary;
    }

    public String getName() {
        return firstName + " " + lastName;
    }
    public String getLastName() {
        return lastName;
    }
    public int getAnnualSalary() {
        return salary * 12;
    }
    public int raiseSalary(int percent) {
        double temp = salary* (1 + percent/100.0);
        salary = (int) temp;
        return salary;
    }
    public String toString(){
        return "Employee[id = " + id + ", Name = " + firstName +" "+ lastName + ", salary = "+ salary +"]";
    }
}
