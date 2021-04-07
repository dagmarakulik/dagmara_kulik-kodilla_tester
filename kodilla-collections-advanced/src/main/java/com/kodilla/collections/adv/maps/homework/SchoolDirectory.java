package com.kodilla.collections.adv.maps.homework;


import java.util.HashMap;
import java.util.Map;

public class SchoolDirectory {
    public static void main(String[] args) {
        Map<Principal, School> school = new HashMap<>();

        Principal jack = new Principal("Jack", " Simpson");
        Principal matt = new Principal("Matt", " Pinkman");
        Principal peter = new Principal("Peter", " Damon");

        School westminsterAcademy = new School("Westminster Academy", 26, 32, 28, 31, 27, 24, 31, 25);
        School regentHighSchool = new School("Regent High School", 22, 24, 30, 25, 21, 20, 26, 23);
        School whitefieldSchool = new School("whitefield School", 19, 17, 21, 15, 16, 16, 25, 20);

        school.put(jack, westminsterAcademy);
        school.put(matt, regentHighSchool);
        school.put(peter, whitefieldSchool);

        for (Map.Entry<Principal, School> schoolEntry : school.entrySet())
            System.out.println(schoolEntry.getKey().getFirstname() + schoolEntry.getKey().getLastname() + ", " + schoolEntry.getValue()) ;
    }
}
