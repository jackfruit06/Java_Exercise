package com.hus.oop.exercise05;

import com.hus.oop.exercise02.MyPoint2D;
public class MyLine extends MyPoint2D {
    private MyPoint2D end;

    public MyLine(int x1, int y1, int x2, int y2) {
        super(x1,y1);
        this.end = new MyPoint2D(x2, y2);
    }

    public MyPoint2D getEnd() {
        return end;
    }

    public void setEnd(MyPoint2D e) {
        this.end = e;
    }
    public MyPoint2D getBegin(){
        return new MyPoint2D(getX(), getY());

    }
    public int getBeginX(){
        return getX();
    }
    public void setBeginY(int y){
        setY(y);
    }
    @Override
    public double distance() {
        return end.distance();
    }

    @Override
    public double distance(MyPoint2D another) {
        return super.distance(this.end);
    }

    @Override
    public double distance(int x, int y) {
        return end.distance(x, y);
    }

}
