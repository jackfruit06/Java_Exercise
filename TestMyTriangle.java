package com.hus.oop.exercise02;
//Exercise 2.9 The MyTriangle And MyPoint CLasses
public class TestMyTriangle {
    public static void main(String[] args) {
        MyTriangle triangle1 = new MyTriangle(3,4,4,5,5,6);
        System.out.println(triangle1);//Test MyTriangle's toString

        MyPoint2D v1 = new MyPoint2D(11, 5);
        MyPoint2D v2 = new MyPoint2D(10,4);
        MyPoint2D v3 = new MyPoint2D(18,20);
        MyTriangle triangle2 = new MyTriangle(v1, v2, v3);
        System.out.println(triangle2);
        //Test getPerimeter()
        System.out.println("The perimeter of triangle 1 is " + triangle1.getPerimeter());
        System.out.println("The perimeter of triangle 2 is: "+ triangle2.getPerimeter());
        //Test getType()
        System.out.println("triangle1 is a "+ triangle1.getType() +" triangle");
        System.out.println("triangle2 is a " + triangle2.getType() + " triangle");



    }
}
