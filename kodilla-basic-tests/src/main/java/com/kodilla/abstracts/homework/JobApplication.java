package com.kodilla.abstracts.homework;

public class JobApplication {
    public static void main(String[] args) {

        Person person1 = new Person("Anna", 31, "Nurse");
        Person person2 = new Person("Hanna", 25, "Teacher");
        Person person3 = new Person("Krzysztof", 45, "Policeman");
        Person person4 = new Person("Filip", 39, "Teacher");

        Nurse nurse = new Nurse();
        Policeman policeman = new Policeman();
        Teacher teacher = new Teacher();

        System.out.println(person1.getFirstname() + " is " + person1.getAge() + " and works as a " + person1.getJob() + ". " + person1.getJob() + " salary is: " + nurse.getSalary() + " and responsibilities are: " + nurse.getResponsibilities());
        System.out.println(person2.getFirstname() + " is " + person2.getAge() + " and works as a " + person2.getJob() + ". " + person2.getJob() + " salary is: " + teacher.getSalary() + " and responsibilities are: " + teacher.getResponsibilities());
        System.out.println(person3.getFirstname() + " is " + person3.getAge() + " and works as a " + person3.getJob() + ". " + person3.getJob() + " salary is: " + policeman.getSalary() + " and responsibilities are: " + policeman.getResponsibilities());
        System.out.println(person4.getFirstname() + " is " + person4.getAge() + " and works as a " + person4.getJob() + ". " + person4.getJob() + " salary is: " + teacher.getSalary() + " and responsibilities are: " + teacher.getResponsibilities());
    }
}
