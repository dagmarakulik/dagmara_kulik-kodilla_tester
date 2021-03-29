package com.kodilla.collections.interfaces.homework;

public class Opel implements Car {

    private int opelSpeed;

    public Opel(int opelSpeed) {
        this.opelSpeed = opelSpeed;
    }

    @Override
    public int getSpeed() {
        return opelSpeed;
    }

    @Override
    public void increaseSpeed() {
        int increasedSpeed = 10;

        opelSpeed += increasedSpeed;

        System.out.println("Opel speed increases to " + opelSpeed + " km/h");
    }

    @Override
    public void decreaseSpeed() {
        int decreaseSpeed = 8;

        opelSpeed -= decreaseSpeed;
        System.out.println("Opel speed decreases to " + opelSpeed + " km/h");
    }
}
