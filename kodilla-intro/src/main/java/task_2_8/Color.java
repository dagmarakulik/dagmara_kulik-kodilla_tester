package task_2_8;

import java.util.Scanner;

public class Color {

    public static String getFirstLetter() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Select calculation: R - red, B - blue, Y - yellow, G - green:");
            String color = scanner.nextLine().trim().toUpperCase();
            switch (color) {
                case "R":
                    return "RED";
                case "B":
                    return "BLUE";
                case "Y":
                    return "YELLOW";
                case "G":
                    return "GREEN";
                default:
                    System.out.println("Wrong letter. Try again.");
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(getFirstLetter());
    }
}

