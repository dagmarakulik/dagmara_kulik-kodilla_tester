package random;

import java.util.Random;

public class Randomizer {
    private int minValue;
    private int maxValue;

    public void generate(){

        Random random = new Random();

        int generateRandomNumbers;
        int sum = 0;
        minValue = 30;
        maxValue = 0;
        while (sum < 5000) {
            int number = random.nextInt(31);
            int oldSum = sum;
            sum = sum + number;
            if (minValue > number) {
                minValue = number;
            }
            if (maxValue < number) {
                maxValue = number;
            }
            System.out.println(oldSum + " + " + number +  " = " + sum);
        }
    }

    public int getMinValue() {
        return minValue;
    }

    public int getMaxValue() {
        return maxValue;
    }
}
