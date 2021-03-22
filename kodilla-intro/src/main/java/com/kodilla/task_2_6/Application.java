package com.kodilla.task_2_6;

public class Application {

    public static void main(String[] args) {

        UserValidator validator  = new UserValidator ("Adam", 20, 165);
        validator.validateName();
        validator.validateAge();
        validator.validateHeight();
    }
}

