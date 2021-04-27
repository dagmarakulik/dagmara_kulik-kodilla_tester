package com.kodilla.execution_model.homework;

import org.junit.jupiter.api.*;

import java.time.LocalDate;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShopTestSuite {

    private Shop shop;
    private Order shoes;
    private Order bags;
    private Order jackets;

    @BeforeEach
    private void prepare() {
        shop = new Shop();
        shoes = new Order(259, LocalDate.of(2020, 3, 5), "mati123");
        bags = new Order(350, LocalDate.of(2019, 5, 30), "jarek.kowalski");
        jackets = new Order(600, LocalDate.of(2021, 3, 25), "1alex");
    }

    @Test
    public void shouldAddNewOrder() {
        //given

        //when
        shop.addOrder(shoes);
        //then
        assertEquals(1, shop.numberOfOrders());
    }


    @Test
    public void shouldReturnNumberOfOrders() {
        //given
        shop.addOrder(shoes);
        shop.addOrder(bags);
        shop.addOrder(jackets);

        //when
        shop.numberOfOrders();

        //then
        assertEquals(3, shop.numberOfOrders());
    }

    @Test
    public void shouldReturnValueOfOrders() {
        //given
        shop.addOrder(shoes);
        shop.addOrder(bags);
        shop.addOrder(jackets);

        //when
        shop.valueOfAllOrders();

        //then
        assertEquals(1209, shop.valueOfAllOrders());
    }

    @Test
    public void shouldGetOrdersIfValueIsInRange() {
        //given
        shop.addOrder(shoes);
        shop.addOrder(bags);
        shop.addOrder(jackets);

        //when
        List<Order> orders = shop.getOrders(250, 1000);
        //then
        assertEquals(3, orders.size());
    }

    @Test
    public void shouldReturnEmptyListIfValueIsOutRange() {
        //given

        //when
        List<Order> emptyList = shop.getOrders(10, 20);

        //then
        assertEquals(Collections.emptyList(), emptyList);
    }

    @Test
    public void shouldReturnOrdersIfDateIsInRange() {
        //given
        shop.addOrder(shoes);
        shop.addOrder(bags);
        shop.addOrder(jackets);

        //when
        List<Order> orders = shop.getOrdersFromToDate(LocalDate.of(2019, 1, 1), LocalDate.of(2022, 2, 20));

        //then
        assertEquals(3, orders.size());
    }

    @Test
    public void shouldReturnEmptyListIfDateIsOutOfRange() {
        //given

        //when
        List<Order> emptyList = shop.getOrdersFromToDate(LocalDate.of(2021, 5, 2), LocalDate.of(2022, 3, 5));

        //then
        assertEquals(Collections.emptyList(), emptyList);
    }
}
