package com.kodilla.optional.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Application {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Magdalena",null));
        students.add(new Student("Mateusz", new Teacher("Maria")));
        students.add(new Student("Krystian", new Teacher("Kamil")));
        students.add(new Student("Hanna", null));
        students.add(new Student("Filip", new Teacher("Rafał")));

        for (Student student : students) {

            Optional<Teacher> optionalTeacher = Optional.ofNullable(student.getTeacher());

            if (optionalTeacher.isPresent()) {
                System.out.println("Student: " + student.getName() + ", Teacher: " + optionalTeacher.get().getName());
            } else {
                System.out.println("Student: " + student.getName() + ", Teacher: undefined");
            }
        }
    }
}
