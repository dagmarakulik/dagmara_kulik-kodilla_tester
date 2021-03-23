package com.kodilla.inheritance.homework;

public class OperatingSystem {
    private int year;

    public OperatingSystem(int year) {
        this.year = year;
    }

    public void turnOn() {
        System.out.println("Windows is starting... " + year);
    }

    public void turnOff() {
        System.out.println("Windows is shutting down... " + year);
    }

    public int getYear() {
        return year;
    }
}
