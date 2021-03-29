package com.kodilla.collections.interfaces.homework;

public class Kia implements Car {

    private int kiaSpeed;

    public Kia(int kiaSpeed) {
        this.kiaSpeed = kiaSpeed;
    }

    public Kia() {

    }

    @Override
    public int getSpeed() {
        return kiaSpeed;
    }

    @Override
    public void increaseSpeed() {
        int increasedSpeed = 12;

        kiaSpeed += increasedSpeed;

        System.out.println("Kia speed increases to " + kiaSpeed + " km/h");
    }

    @Override
    public void decreaseSpeed() {
        int decreaseSpeed = 9;

        kiaSpeed -= decreaseSpeed;
        System.out.println("Kia speed decreases to " + kiaSpeed + " km/h");
    }

    @Override
    public int getYear() {
        return 2020;
    }

    @Override
    public String getColor() {
        return "White";
    }

    @Override
    public void increaseSpeedRandomly(int speed) {
        kiaSpeed += speed;
    }
}
