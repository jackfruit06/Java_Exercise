package com.hus.oop.exercise02;
//Exercise 2.8 The MyCircle and MyPoint classes
public class TestMyCircle {
    public static void main(String[] args) {
        MyCircle circle1 = new MyCircle(); // Test constructor
        System.out.println(circle1);
        //Test setter
        circle1.setCenterX(4);
        circle1.setCenterY(3);
        circle1.setRadius(5);
        System.out.println(circle1);
        //Test getter
        System.out.println("x is: " +circle1.getCenterX());
        System.out.println("y is: " + circle1.getCenterY());
        System.out.println("radius is: " + circle1.getRadius());
        //Test setCenterXY();
        circle1.setCenterXY(3,8);
        System.out.println(circle1.getCenterXY()[0]);
        System.out.println(circle1.getCenterXY()[1]);
        System.out.println(circle1);
        //Test another constructor
        System.out.printf("area is: %.2f\n" ,circle1.getArea());
        System.out.printf("circumference is: %.2f\n" , circle1.getCircumference());

        MyPoint2D point1 = new MyPoint2D(4,5);
        MyCircle circle2 = new MyCircle(point1,9);
        System.out.println("distance: " + circle1.distance(circle2));

    }
}
