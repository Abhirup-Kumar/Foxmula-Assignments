package com.foxmula.assignment1.Q3;

public class Main {
    public static void main(String[] args) {
        Trapezoid trapez = new Trapezoid(6,7,16,31,34,31,50,7,40);
        System.out.println("Trapezoid's Area: " + trapez.area());

        Parallelogram parallel= new Parallelogram(6,7,18,26,48,26,36,7,40);
        System.out.println("Parallelogram's Area: " + parallel.area());

        Square sqr = new Square(3,0,3,30,33,30,33,0);
        System.out.println("Square's Area: " + sqr.area());

        Rectangle rect = new Rectangle(39,0,7,18,16,34,48,16);
        System.out.println("Rectangle's Area: " + rect.area());

    }
}
