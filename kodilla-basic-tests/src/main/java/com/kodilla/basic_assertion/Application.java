package com.kodilla.basic_assertion;

public class Application {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int sumResult = calculator.sum(a, b);
        boolean correct = ResultChecker.assertEquals(13, sumResult);
        if (correct) {
            System.out.println("Metoda sum działa poprawnie dla liczb " + a + " i " + b);
        } else {
            System.out.println("Metoda sum nie działa poprawnie dla liczb " + a + " i " + b);
        }
        int subtractionResult = calculator.subtract(a, b);
        boolean right = ResultChecker.assertEquals(-3, subtractionResult);
        if (right) {
            System.out.println("Metoda działa poprawnie dla liczb " + a + " i " + b);
        } else {
            System.out.println("Metoda nie działa poprawnie dla liczb " + a + " i " + b);
        }
        int powerResult = calculator.pow(a);
        boolean good = ResultChecker.assertEquals(24, powerResult);
        if (good) {
            System.out.println("Metoda działa poprawnie dla liczb " + a + " i " + b);
        } else {
            System.out.println("Metoda nie działa poprawnie dla liczb " + a + " i " + b);
        }
    }
}
