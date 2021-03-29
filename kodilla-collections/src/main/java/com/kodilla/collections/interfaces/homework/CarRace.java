package com.kodilla.collections.interfaces.homework;

import com.kodilla.collections.interfaces.Shape;

public class CarRace {
    public static void main(String[] args) {

        Ford ford = new Ford(50);
        doRace(ford);

        Kia kia = new Kia(60);
        doRace(kia);

        Opel opel = new Opel(70);
        doRace(opel);
    }
    private static void doRace(Car car) {
        car.increaseSpeed();
        car.increaseSpeed();
        car.increaseSpeed();
        car.decreaseSpeed();
        car.decreaseSpeed();
        System.out.println(car.getSpeed());
    }
}
