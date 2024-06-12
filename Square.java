package com.hus.oop.exercise05;

public class Square extends Rectangle{


     public Square(double edge1){
         super(edge1,edge1);

     }
     public void setSide(double s1){
         setLength(s1);
         setWidth(s1);
     }

    @Override
    public double getPerimeter() {
        return super.getPerimeter();
    }

    @Override
    public double getArea() {
        return super.getArea();
    }
    public String toString(){
         return "Square[edge = " + super.getLength() + "]";
    }
}


