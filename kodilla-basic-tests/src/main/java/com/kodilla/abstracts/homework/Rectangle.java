package com.kodilla.abstracts.homework;

public class Rectangle extends Shape {

    public Rectangle() {
        super(2, 2, 5, 5);
    }

    @Override
    public double getArea() {
        return getA() * getC();

    }

    @Override
    public double getPerimeter() {
        return 2 * (getA() + getC());
    }

    @Override
    public void giveData() {
        System.out.println("Rectangle area is: " + getArea() + " and perimeter is: " + getPerimeter());
    }
}