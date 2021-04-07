package com.kodilla.collections.adv.maps.homework;

import java.util.ArrayList;
import java.util.List;

public class School {
    private List<Integer> studentsInSchool = new ArrayList<>();
    private String schoolName;

    public School(String schoolName, Integer... school) {
        for (Integer quantity : school) {
            this.studentsInSchool.add(quantity);
        }
        this.schoolName = schoolName;
    }

    @Override
    public String toString() {
        return "school name = " + schoolName + ", students in school: " + getNumberOfStudentsInSchool();
    }

    public int getNumberOfStudentsInSchool() {
        int sum = 0;
        for (int quantity : studentsInSchool)
            sum += quantity;
        return sum;
    }
}
