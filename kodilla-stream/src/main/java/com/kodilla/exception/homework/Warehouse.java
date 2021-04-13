package com.kodilla.exception.homework;

import com.kodilla.stream.homework.Task;
import com.kodilla.stream.homework.TaskRepository;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Warehouse {
       private List<Order> orders = new ArrayList<>();

    public void addOrder(Order order) {
        orders.add(order);
    }

    public Order getOrder(String number) throws OrderDoesntExistException {

        Optional<Order> result = orders
                .stream()
                .filter(order -> order.getNumber().equals(number))
                .findFirst();

        if(result.isEmpty()) {
            throw new OrderDoesntExistException();
        }
        return result.get();
    }

}
