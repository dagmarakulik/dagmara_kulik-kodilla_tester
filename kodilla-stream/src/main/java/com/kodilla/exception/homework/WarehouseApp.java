package com.kodilla.exception.homework;

import com.kodilla.exception.AirportNotFoundException;

public class WarehouseApp {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        warehouse.addOrder(new Order("1"));
        warehouse.addOrder(new Order("5"));
        warehouse.addOrder(new Order("7"));
        warehouse.addOrder(new Order("9"));
        warehouse.addOrder(new Order("10"));

        try {
            System.out.println("Found order number: " + warehouse.getOrder("11").getNumber());
        } catch (OrderDoesntExistException e) {
            System.out.println("There is no such order.");
        }
    }
}
