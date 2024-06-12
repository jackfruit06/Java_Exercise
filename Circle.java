package com.hus.oop.exercise05;

public class Circle implements Shape{
    private double radius;
    public Circle() {
        radius = 1.0;
    }
    public Circle(double r) {
        this.radius = r;
    }
    public void setRadius(double newRadius) { //in order to set follow what do you want
        this.radius = newRadius;
    }
    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
    public String toString(){
        return "Circle [radius = " + radius + "]";
    }

}