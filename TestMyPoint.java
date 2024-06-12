package com.hus.oop.exercise02;
//Exercise 2.6 The MyPoint Classes
public class TestMyPoint {
    public static void main(String[] args) {
        MyPoint2D point1 = new MyPoint2D(); // Test constructor
        System.out.println(point1);

        //Test setter
        point1.setX(8);
        point1.setY(6);
        // Test getter
        System.out.println("x is: " +point1.getX());
        System.out.println("y is: " + point1.getY());

        point1.setXY(2,4);//Test setXY()
        System.out.println(point1.getXY()[0]);
        System.out.println(point1.getXY()[1]);
        System.out.println(point1);

        MyPoint2D point2 = new MyPoint2D(0,4); // Test another constructor
        System.out.println(point2);
        // Test the methods distance()
        System.out.println(point1.distance(point2));
        System.out.println(point2.distance(point1));
        System.out.println(point1.distance(5,6));//point1(2,4)
        System.out.println(point1.distance());
    }
}
