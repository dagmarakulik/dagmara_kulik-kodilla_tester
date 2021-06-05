package com.kodilla.abstracts.homework;

public class Person {

    String firstname;
    int age;
    String job;

    public Person(String firstname, int age, String job) {
        this.firstname = firstname;
        this.age = age;
        this.job = job;
    }

    public String getFirstname() {
        return firstname;
    }

    public int getAge() {
        return age;
    }

    public String getJob() {
        return job;
    }
}
