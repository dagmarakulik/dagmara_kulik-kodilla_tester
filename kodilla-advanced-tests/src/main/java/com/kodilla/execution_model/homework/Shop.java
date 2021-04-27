package com.kodilla.execution_model.homework;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Shop {

    private List<Order> listOfOrders = new ArrayList<>();

    public void addOrder(Order order) {
        this.listOfOrders.add(order);
    }

    public List<Order> getOrdersFromToDate(LocalDate from, LocalDate to) {
        return listOfOrders.stream()
                .filter(date -> date.getDate().isAfter(from) && date.getDate().isBefore(to))
                .collect(Collectors.toList());
    }

    public List<Order> getOrders(double priceFrom, double priceTo) {
        return listOfOrders.stream()
                .filter(value -> value.getOrderValue() > priceFrom && value.getOrderValue() < priceTo)
                .collect(Collectors.toList());
    }

    public int numberOfOrders() {
        return listOfOrders.size();
    }

    public double valueOfAllOrders() {
        double sum = 0;
        for (Order order : listOfOrders) {
            sum += order.getOrderValue();
        }

        return sum;
    }
}
