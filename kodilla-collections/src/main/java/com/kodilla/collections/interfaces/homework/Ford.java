package com.kodilla.collections.interfaces.homework;

public class Ford implements Car {

    private int fordSpeed;

    public Ford(int fordSpeed) {
        this.fordSpeed = fordSpeed;
    }

    @Override
    public int getSpeed() {
        return fordSpeed;
    }

    @Override
    public void increaseSpeed() {
        int increasedSpeed = 10;

        fordSpeed += increasedSpeed;

        System.out.println("Ford speed increases to " + fordSpeed + " km/h");
    }

    @Override
    public void decreaseSpeed() {
        int decreaseSpeed = 5;

        fordSpeed -= decreaseSpeed;
        System.out.println("Ford speed decreases to " + fordSpeed + " km/h");
    }
}
