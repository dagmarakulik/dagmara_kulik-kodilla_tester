package com.kodilla.collections.arrays.homework;
import com.kodilla.collections.arrays.ShapeUtils;
import com.kodilla.collections.interfaces.Circle;
import com.kodilla.collections.interfaces.Shape;
import com.kodilla.collections.interfaces.Square;
import com.kodilla.collections.interfaces.Triangle;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Kia;
import com.kodilla.collections.interfaces.homework.Opel;
import com.kodilla.collections.interfaces.homework.Car;

import java.util.Random;
import java.util.concurrent.Callable;

public class CarsApplication {

    public static void main(String[] args) {
        Car[] cars = new Car[15];
        for (int n = 0; n < cars.length; n++)
            cars[n] = drawCar();
        for (Car car : cars)
            CarUtils.describeCar(car); // wykonaj pewną operację dla każdego elementu tablicy shapes
    }

    public static Car drawCar() {
        Random randomCar = new Random();
        int typeOfCar = randomCar.nextInt(3);// możliwe 3 samochody do wyboru
        double x = randomCar.nextDouble() * 100 + 1; // possible values: 1.000-100.999
        double y = randomCar.nextDouble() * 100 + 1;
        double z = randomCar.nextDouble() * 100 + 1;
        Random randomSpeedIncrease = new Random();
        int randomNumber = randomSpeedIncrease.nextInt(60) + 1;
        if (typeOfCar == 0) {
            Ford newFord = new Ford(0);
            newFord.increaseSpeedRandomly(randomNumber);
            return newFord;
        } else if (typeOfCar == 1) {
            Kia newKia = new Kia(0);
            newKia.increaseSpeedRandomly(randomNumber);
            return newKia;
        } else {
            Opel newOpel = new Opel(0);
            newOpel.increaseSpeedRandomly(randomNumber);
            return newOpel;
        }
    }
}
