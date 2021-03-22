package com.kodilla;

import java.util.Random;

public class LeapYear {
    public static void main(String[] args) {
        int year = 2018;
        if (checkIfYearIsLeap(year)) {
            System.out.println("Rok jest przestępny");
        } else {
            System.out.println("Rok nie jest przestępny");
        }
    }

    public static boolean checkIfYearIsLeap(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            return true;
        } else {
            return false;
        }
    }
}