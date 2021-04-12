package com.kodilla.stream.homework;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public class TaskManager {
    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now();

        List<LocalDate> deadline = TaskRepository.getTasks()
                .stream()
                .filter(u -> u.getDeadLine().isAfter(currentDate))
                .map(Task::getDeadLine)
                .collect(Collectors.toList());
        System.out.println(deadline);
    }
}
