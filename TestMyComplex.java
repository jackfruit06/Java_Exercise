package com.hus.oop.exercise01;

public class TestMyComplex {
    public static void main(String[] args) {
        MyComplex complex1 = new MyComplex();
        System.out.println(complex1);//Test constructor

        MyComplex complex2 = new MyComplex(1.1, 2.1);
        System.out.println(complex2);
        // Test getter
        System.out.println("real of complex2 is: " + complex2.getReal());
        System.out.println("imagine of complex2 is : " + complex2.getImagine());
        // Test isReal() and isImaginary()
        System.out.println(complex2.isReal());
        System.out.println(complex2.isImaginary());
        // Test equals() and equals(.MyComplex)
        if(complex1.equals(1.1,2.2)) {
            System.out.println("true");
        } else{
            System.out.println("false");
        }
        if(complex2.equals(complex1)){
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        // Test magnitude()
        System.out.printf("magnitude of complex2 is: %.2f\n" , complex2.magnitude());
        System.out.printf("magnitude of complex1 is: %.2f\n" , complex1.magnitude());
        // Test another methods
        MyComplex complex3 = new MyComplex(3,1);
        System.out.println(complex3);

        System.out.println(complex2.add(complex3));
        System.out.println(complex2.addNew(complex3));
        System.out.println(complex2.subtract(complex3));
        System.out.println(complex2.subtractNew(complex3));
        System.out.println(complex2.multiply(complex3));
        System.out.println(complex2.divide(complex3));
        System.out.println(complex2.conjugate());
    }
}
