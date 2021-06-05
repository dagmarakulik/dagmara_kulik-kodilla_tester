package com.kodilla.abstracts.homework;

import java.awt.geom.Area;

public abstract class Shape {

    private double a;
    private double b;
    private double c;
    private double h;

    public Shape(double a, double b, double c, double h) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.h = h;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getH() {
        return h;
    }

    public abstract double getArea();

    public abstract double getPerimeter();

    public abstract void giveData();
}
