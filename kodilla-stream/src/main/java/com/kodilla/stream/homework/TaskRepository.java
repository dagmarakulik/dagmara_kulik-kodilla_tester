package com.kodilla.stream.homework;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TaskRepository {
    public static List<Task> getTasks() {
        List<Task> tasks = new ArrayList<>();
        tasks.add(new Task("Project", LocalDate.of(2021, 3, 20), LocalDate.of(2032, 5, 11)));
        tasks.add(new Task("TaskList", LocalDate.of(2020, 10,27), LocalDate.of(2021, 2, 28)));
        tasks.add(new Task("Library", LocalDate.of(2021,1,30), LocalDate.of(2021, 4, 10)));
        tasks.add(new Task("Immutable", LocalDate.of(2020, 12, 3), LocalDate.of(2021, 5, 10)));
        tasks.add(new Task("Maps", LocalDate.of(2021, 4, 3), LocalDate.of(2030, 7, 30)));

        return tasks;
    }
}
