package com.kodilla.collections.lists.homework;

import com.kodilla.collections.arrays.homework.CarUtils;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Kia;
import com.kodilla.collections.interfaces.homework.Opel;

import java.util.ArrayList;
import java.util.List;

public class CarsListApplication {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Ford(40));
        cars.add(new Kia(70));
        Opel opel = new Opel(40);
        cars.add(opel);
        cars.add(new Ford(60));

        cars.remove(0);
        cars.remove(opel);

        System.out.println(cars.size());
        for (Car car : cars) {
            if (car.getSpeed() > 30)
                CarUtils.describeCar(car);
        }
    }
}

