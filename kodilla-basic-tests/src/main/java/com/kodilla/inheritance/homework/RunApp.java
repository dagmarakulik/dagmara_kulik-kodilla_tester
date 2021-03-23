package com.kodilla.inheritance.homework;

public class RunApp {

    public static void main(String[] Args) {
        OperatingSystem operatingSystem = new OperatingSystem(1996);
        operatingSystem.turnOn();
        operatingSystem.turnOff();

        MacOSOperatingSystem macOSOperatingSystem = new MacOSOperatingSystem(2000);
        macOSOperatingSystem.turnOn();
        macOSOperatingSystem.turnOff();

        LinuxOperatingSystem linuxOperatingSystem = new LinuxOperatingSystem(1998);
        linuxOperatingSystem.turnOn();
        linuxOperatingSystem.turnOff();
    }
}
