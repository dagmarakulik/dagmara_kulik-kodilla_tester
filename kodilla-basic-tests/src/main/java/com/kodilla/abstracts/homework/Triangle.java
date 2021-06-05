package com.kodilla.abstracts.homework;

public class Triangle extends Shape {

    public Triangle() {
        super(5, 4, 8, 3);
    }

    @Override
    public double getArea() {
        return (getA() * getH()) / 2;

    }

    @Override
    public double getPerimeter () {
        return getA() + getB() + getC();
    }

    @Override
    public void giveData() {
        System.out.println("Triangle area is: " + getArea() + " and perimeter is: " + getPerimeter());
    }
}


