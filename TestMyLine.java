package com.hus.oop.exercise02;
//Exercise 2.7 The MyLine and MyPoint Classes
public class TestMyLine {
    public static void main(String[] args) {
        MyLine line1 = new MyLine(1, 2, 3, 4);
        System.out.println(line1); //Test constructor

        MyPoint2D begin = new MyPoint2D(6, 2);
        MyPoint2D end = new MyPoint2D(3, 8);
        MyLine line2 = new MyLine(begin, end);
        System.out.println(line2);

        //Test setter
        line1.setBeginX(10);
        line1.setBeginY(25);
        line1.setEndX(9);
        line1.setEndY(7);
        System.out.println(line1);
        //Test getter
        System.out.println("begin's x is: " + line1.getBeginX());
        System.out.println("begin's y is: " + line1.getBeginY());
        System.out.println("end's x is: " + line1.getEndX());
        System.out.println("end's y is: " + line1.getEndY());
        //Test setBeginXY() && setEndXY
        line2.setBeginXY(18, 10);
        line2.setEndXY(12, 6);
        System.out.println(line2.getBeginXY()[0]);
        System.out.println(line2.getBeginXY()[1]);
        System.out.println(line2.getEndXY()[0]);
        System.out.println(line2.getEndXY()[1]);
        System.out.println(line2);
        //Test another constructor
        System.out.printf("The length of line1 is: %.2f\n" , line1.getLength());//line1[(10,25),(9,7)]
        System.out.printf("The length of line2 is: %.2f\n" , line2.getLength());
        System.out.println(line1.getGradient());//line1's begin
    }

}
