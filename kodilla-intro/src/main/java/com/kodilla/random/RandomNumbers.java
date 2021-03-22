package com.kodilla.random;

import java.util.Random;

public class RandomNumbers {

    public static void main(String[] args) {
        Randomizer randomizer = new Randomizer();
        randomizer.generate();
        System.out.println(randomizer.getMinValue());
        System.out.println(randomizer.getMaxValue());
    }
}