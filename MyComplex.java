package com.hus.oop.exercise01;

public class MyComplex{
    private double real;
    private double imagine;
    public MyComplex(){
        this(0.0,0.0);
    }
    public MyComplex(double real, double imagine) {
        this.real = real;
        this.imagine= imagine;
    }
    public void setReal(double newReal){
        this.real = newReal;
    }
    public double getReal(){
        return real;
    }
    public void setImagine(double newImagine){
        this.imagine = newImagine;
    }
    public double getImagine(){
        return imagine;
    }
    public void setValue(double real, double imagine){
        this.real = real;
        this.imagine= imagine;
    }
    public String toString() {
        if (imagine == 1) {
            return "(" + real + (imagine < 0 ? "-" : "+") + "i)";
        } else if(imagine == 0) {
            return "" +real;
        } else if (real == 0) {
            return (imagine < 0 ? "-" : "") + Math.abs(imagine) + "i)";
        } else {
            return "(" + real + (imagine < 0 ? "-" : "+") + Math.abs(imagine) + "i)";
        }
    }

    public boolean isReal(){
        return (imagine == 0);
    }
    public boolean isImaginary(){
        return (real == 0);
    }
    public boolean equals(double real, double imagine){
        return (this.real == real && this.imagine == imagine);
    }
    public boolean equals(MyComplex another){
        return (this.real == another.getReal() && this.imagine == another.getImagine());
    }
    public double magnitude(){
        return Math.sqrt((real*real) + (imagine*imagine));
    }
    public MyComplex add(MyComplex right){
        this.real += right.getReal();
        this.imagine  += right.getImagine();
       return  this;
    }
    public MyComplex addNew(MyComplex right) {
        return new MyComplex(this.real + right.getReal(), this.imagine + right.getImagine());
    }

    public MyComplex subtract(MyComplex right){
        this.real -= right.getReal();
        this.imagine  -= right.getImagine();
        return  this;
    }
    public MyComplex subtractNew(MyComplex right) {

        return new MyComplex(this.real - right.getReal(), this.imagine - right.getImagine());
    }
    public MyComplex multiply(MyComplex right){
        this.real = this.real * right.getReal() - this.imagine * right.getImagine();
        this.imagine = this.real * right.imagine + this.imagine * right.getReal();
        return this;
    }
    public MyComplex divide(MyComplex right){
        double rightReal = right.getReal();
        double rightImagine = right.getImagine();
        double denom = Math.pow(rightReal,2) + Math.pow(rightImagine,2);
        MyComplex uniteRight = new MyComplex(right.getReal(), (-1) * right.getImagine());
        right.multiply(uniteRight);
        this.real /= denom;
        this.imagine/= denom;
        return this;
    }
    public MyComplex conjugate(){
        return new MyComplex(real,(-1)*imagine);
    }


}
