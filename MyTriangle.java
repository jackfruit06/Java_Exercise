package com.hus.oop.exercise02;

public class MyTriangle {
    private MyPoint2D v1;
    private MyPoint2D v2;
    private MyPoint2D v3;

    public MyTriangle(int x1, int y1, int x2, int y2, int x3, int y3){
        this.v1 = new MyPoint2D(x1,y1);
        this.v2 = new MyPoint2D(x2,y2);
        this.v3 = new MyPoint2D(x3,y3);
    }
    public MyTriangle(MyPoint2D v1, MyPoint2D v2, MyPoint2D v3){
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }
    public String toString(){
        return "MyTriangle[v1 = " + v1.toString() + ", v2 = " + v2.toString() + ", v3 = " + v3.toString() + "]";
    }
    public double getPerimeter(){
        double edge1 = v1.distance(v2);
        double edge2 = v2.distance(v3);
        double edge3 = v1.distance(v3);
        return (edge3 +edge1+edge2);
    }
    public String getType(){
        double edge1 = v1.distance(v2);
        double edge2 = v2.distance(v3);
        double edge3 = v1.distance(v3);
        if(edge3 == edge1 && edge3 == edge2 ){
            return "Equilateral";
        } else if((edge3 != edge1) && (edge1 != edge2) &&(edge2 != edge3)){
            return "Isosceles";
        } else{
            return "Scalene";
        }
    }

}
