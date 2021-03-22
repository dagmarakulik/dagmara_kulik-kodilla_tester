package com.kodilla.task_2_6;
public class UserValidator {
    private String name;
    private double age;
    private double height;

    public UserValidator (String name, double age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public boolean validateName() {
        if (name != null) {
            return true;
        }
        return false;
    }

    public void validateAge() {
        if (age > 30) {
            System.out.println("User is older than 30");
        } else {
            System.out.println("User is 30 (or younger)");
        }
    }

    public void validateHeight() {
        if (height > 160) {
            System.out.println("User is higher than 160cm");
        } else {
            System.out.println("User is 160cm (or shorter)");
        }
    }
}

