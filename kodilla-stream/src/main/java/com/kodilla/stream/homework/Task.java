package com.kodilla.stream.homework;

import java.time.LocalDate;
import java.util.Objects;

public class Task {
    private String name;
    private LocalDate opened;
    private LocalDate deadLine;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return Objects.equals(name, task.name) && Objects.equals(opened, task.opened) && Objects.equals(deadLine, task.deadLine);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, opened, deadLine);
    }

    public Task(String name, LocalDate opened, LocalDate deadLine) {
        this.name = name;
        this.opened = opened;
        this.deadLine = deadLine;
    }

    public String getName() {
        return name;
    }

    public LocalDate getOpened() {
        return opened;
    }

    public LocalDate getDeadLine() {
        return deadLine;
    }
}
