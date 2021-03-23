package com.kodilla.inheritance.homework;

public class LinuxOperatingSystem extends MacOSOperatingSystem {
    public LinuxOperatingSystem(int year) {
        super(year);
    }

    @Override
    public void turnOn(){
        System.out.println("Linux is turning on... " + getYear());
    }

    public void turnOff(){
        System.out.println("Linux is turning off... " + getYear());
    }
}
