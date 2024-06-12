package com.hus.oop.exercise02;

public class MyCircle {
    private MyPoint2D center;
    private int radius;

    public MyCircle(){
        this.center = new MyPoint2D(0,0);
        this.radius = 1;
    }

    public MyCircle(MyPoint2D center, int radius){
        this.center = center;
        this.radius = radius;
    }
    public int getRadius(){
        return radius;
    }
    public void setRadius(int radius){
        this.radius = radius;
    }
    public MyPoint2D getCenter(){
        return center;
    }
    public void setCenter(MyPoint2D center){
        this.center = center;
    }
    public int getCenterX(){
        return this.center.getX();
    }
    public void setCenterX(int x){
        this.center.setX(x);
    }
    public int getCenterY(){
        return this.center.getY();
    }
    public void setCenterY(int y){
        this.center.setY(y);
    }
    public int[] getCenterXY(){
        return new int[]{center.getX(), center.getY()};
    }
    public void setCenterXY(int x, int y){
        this.center.setX(x);
        this.center.setY(y);
    }
    public String toString(){
        return "MyCircle[radius = " + radius + ", center = " + center.toString() + "]";
    }
    public double getArea(){
        return radius*radius*Math.PI;
    }
    public double getCircumference(){
        return 2 * radius*Math.PI;
    }
    public double distance(MyCircle another){
       return  center.distance(another.center);
    }
}
