package com.kodilla.collections.interfaces.homework;

public class Ford implements Car {

    private int fordSpeed;

    public Ford(int fordSpeed) {
        this.fordSpeed = fordSpeed;
    }

    public Ford() {

    }

    @Override
    public int getSpeed() {
        return fordSpeed;
    }

    @Override
    public void increaseSpeed() {
        int increaseSpeed = 10;

        fordSpeed += increaseSpeed;

        System.out.println("Ford speed increases to " + fordSpeed + " km/h");
    }

    @Override
    public void decreaseSpeed() {
        int decreaseSpeed = 5;

        fordSpeed -= decreaseSpeed;
        System.out.println("Ford speed decreases to " + fordSpeed + " km/h");
    }

    @Override
    public int getYear() {
        return 1999;
    }

    @Override
    public String getColor() {
        return "Black";
    }

    @Override
    public void increaseSpeedRandomly(int speed) {
        fordSpeed += speed;
    }


}
