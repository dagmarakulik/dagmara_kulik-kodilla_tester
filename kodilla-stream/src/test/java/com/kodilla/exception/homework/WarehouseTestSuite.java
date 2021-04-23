package com.kodilla.exception.homework;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class WarehouseTestSuite {

    @Test
    public void testDoesOrderExist() throws OrderDoesntExistException {
        //given
        Warehouse warehouse = new Warehouse();
        Order orderToInsert = new Order("5");
        warehouse.addOrder(orderToInsert);
        //when
        Order extractedOrder = warehouse.getOrder("5");
        //then
        assertEquals(orderToInsert, extractedOrder);
    }

    @Test(expected = OrderDoesntExistException.class)
    public void testGetOrder_withException() throws OrderDoesntExistException {
        //given
        Warehouse warehouse = new Warehouse();
        //when
        Order doesOrderExist = warehouse.getOrder("13");
        //then
        assertEquals(warehouse.getOrder("13"), doesOrderExist);

    }
}