package com.hus.oop.exercise05;

public class Rectangle implements Shape{
    private double length;
    private double width;
    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }
    public double getLength(){
        return length;
    }
    public void setLength(double length){
        this.length = length;
    }
    public double getWidth(){
        return width;
    }
    public void setWidth(double width){
        this.width = width;
    }

    @Override
    public double getArea() {
        return length*width;
    }

    @Override
    public double getPerimeter() {
        return 2 * (length + width);
    }
    public String toString(){
        return "Rectangle[length = " + length + ", width = " + width + "]";
    }
}
