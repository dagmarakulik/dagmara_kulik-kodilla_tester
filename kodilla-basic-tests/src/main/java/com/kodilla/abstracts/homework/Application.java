package com.kodilla.abstracts.homework;

public class Application {
    public static void main(String[] args) {

        Shape square = new Square();
        square.getArea();
        square.getPerimeter();
        square.giveData();

        Rectangle rectangle = new Rectangle();
        rectangle.getArea();
        rectangle.getPerimeter();
        rectangle.giveData();

        Triangle triangle = new Triangle();
        triangle.getArea();
        triangle.getPerimeter();
        triangle.giveData();
    }

}
