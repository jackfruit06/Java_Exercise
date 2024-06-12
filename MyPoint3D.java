package com.hus.oop.exercise05;

import com.hus.oop.exercise02.MyPoint2D;

public class MyPoint3D extends MyPoint2D {
    private int z;

    public MyPoint3D(){
        super();
        this.z = 1;
    }
    public MyPoint3D(int x, int y, int z){
        super(x, y);
        this.z = z;
    }
    public int getZ(){
        return z;
    }
    public void setZ(int z1){
        this.z = z1;
    }

    public void setXYZ(int x, int y, int z){
        setX(x);
        setY(y);
        this.z = z;
    }
    public int[] getXYZ() {
        return new int[]{getX(),getY(),z};
    }
    public String toString(){
        return "(" + getX() +", " + getY() + ", "+ z +").";
    }
}




