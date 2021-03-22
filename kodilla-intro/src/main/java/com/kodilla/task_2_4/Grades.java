package com.kodilla.task_2_4;

public class Grades {
    private int[] grades;
    private int size;

    public Grades() {
        this.grades = new int[10];
        this.size = 0;

    }

    public void add(int value) {
        if (this.size == 10) {
            return;
        }
        this.grades[this.size] = value;
        this.size++;
    }

    public int checkLastAddedGrade() {
        if (this.size == 0) {
            return 0;
        } else {
            return grades[size - 1];
        }
    }

    public double calculateAverageGrade() {
        double sum = 0;

        for (int i = 0; i < grades.length; i++) {
            sum += this.grades[i] ;
        }
        double result = sum / size;
        return result;
    }
}
