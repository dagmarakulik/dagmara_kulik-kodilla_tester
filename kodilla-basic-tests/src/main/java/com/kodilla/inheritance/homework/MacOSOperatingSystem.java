package com.kodilla.inheritance.homework;

public class MacOSOperatingSystem extends OperatingSystem {

    public MacOSOperatingSystem(int year) {
        super(year);
    }

    @Override
    public void turnOn(){
        System.out.println("macOS is starting... " + getYear());
    }

    public void turnOff(){
        System.out.println("macOS is shutting down... " + getYear());
    }
}
