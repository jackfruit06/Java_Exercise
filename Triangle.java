package com.hus.oop.exercise05;

public class Triangle implements Shape{
    private double side1;
    private double side2;
    private double side3;

    public Triangle(double s1, double s2, double s3){
        this.side1 = s1;
        this.side2 = s2;
        this.side3 = s3;
    }
    public double getSide1(){
        return side1;
    }
    public void setSide1(double s1){
        this.side1 = s1;
    }
    public double getSide2(){
        return side2;
    }
    public void setSide2(double s2){
        this.side2 = s2;
    }
    public double getSide3(){
        return side3;
    }
    public void setSide3(double s3){
        this.side3 = s3;
    }

    @Override
    public double getPerimeter() {
        return side1 + side2 + side3;
    }
    public double getArea(){
        double halfCircumference = getPerimeter() / 2;
        return Math.sqrt(halfCircumference * (halfCircumference - side1) * (halfCircumference - side2) * (halfCircumference- side3));
    }
    public String toString(){
        return "Triangle(" + side1 + ", " + side2 +", " + side3 +")";
    }
}
