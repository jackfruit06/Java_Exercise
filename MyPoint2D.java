package com.hus.oop.exercise02;

public class MyPoint2D {
    private int x;
    private int y;

    public MyPoint2D(){
        this(0,0);
    }
    public MyPoint2D(int x, int y){
        this.x = x;
        this.y = y;
    }
    public int getX(){
        return x;
    }
    public void setX(int x1) {
        this.x = x1;
    }
    public int getY(){
        return y;
    }
    public void setY(int y1) {
        this.y = y1;
    }
    public int[] getXY(){
        return new int[]{x,y};
    }
    public void setXY(int x, int y){
        this.x = x;
        this.y = y;
    }
    public String toString(){
        return "(" + x + "," + y +")";
    }
    public double distance(int x, int y){
        int newX = this.x - x;
        int newY = this.y - y;
        return Math.sqrt(newX * newX + newY * newY);
    }
    public double distance(MyPoint2D another){
        int x1 = this.x - another.x;
        int y1 = this.y - another.y;
        return Math.sqrt(x1 * x1 + y1 * y1);
    }
    public double distance(){
        return Math.sqrt(this.x * this.x + this.y * this.y);
    }
}
