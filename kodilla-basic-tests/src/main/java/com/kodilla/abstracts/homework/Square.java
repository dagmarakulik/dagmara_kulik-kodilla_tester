package com.kodilla.abstracts.homework;

public class Square extends Shape {

    public Square() {
        super(5, 5, 5, 5);
    }

    @Override
    public double getArea() {
        return getA() * getB();

    }

    @Override
    public double getPerimeter() {
        return 4 * getA();
    }

    @Override
    public void giveData() {
        System.out.println("Square area is: " + getArea() + " and perimeter is: " + getPerimeter());
    }
}

