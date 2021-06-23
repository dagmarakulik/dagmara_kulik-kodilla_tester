package com.kodilla.bank.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

class CashMachineTestSuite {

    @Test

    public void shouldHaveZeroLength() { // Test dla sprawdzenia zerowej dlugosci tabeli
        CashMachine cashmachine = new CashMachine();
        int[] values = cashmachine.getTransactions();
        assertEquals(0, values.length);
    }

    @Test
    public void shouldAddElementsToArray() {
        CashMachine cashmachine = new CashMachine();
        cashmachine.addTransaction(500);
        cashmachine.addTransaction(-300);
        cashmachine.addTransaction(-100);

        int[] values = cashmachine.getTransactions();
        assertEquals(3, values.length);
    }

    @Test
    public void shouldReturn0IfTransactionArrayIsEmpty(){
        CashMachine cashMachine = new CashMachine();
        int[] transaction = cashMachine.getTransactions();
         assertEquals(0, transaction.length);
    }

    @Test
    public void shouldGetBalance() {
        CashMachine cashmachine = new CashMachine();
        cashmachine.addTransaction(200);
        cashmachine.addTransaction(500);
        cashmachine.addTransaction(-200);
        cashmachine.addTransaction(-100);

        assertEquals(400, cashmachine.getBalance(),0.01);
    }

    @Test
    public void shouldGetCorrectBalanceIfTransactionIsInvalid() {
        CashMachine cashmachine = new CashMachine();
        cashmachine.addTransaction(200);
        cashmachine.addTransaction(500);
        cashmachine.addTransaction(-200);
        cashmachine.addTransaction(-700);

        int[] values = cashmachine.getTransactions();
        assertEquals(3, values.length);
    }
    @Test
    public void shouldGetWithdrawalAverage() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.addTransaction(200);
        cashMachine.addTransaction(-100);
        cashMachine.addTransaction(100);
        cashMachine.addTransaction(-100);
        cashMachine.addTransaction(-100);

        assertEquals(-100, cashMachine.withdrawalAverage(), 0.1);
    }

    @Test
    public void shouldGetWithdrawalAverageIfTransactionIsInvalid() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.addTransaction(-200);
        cashMachine.addTransaction(-100);
        cashMachine.addTransaction(-100);
        cashMachine.addTransaction(800);
        cashMachine.addTransaction(-100);
        cashMachine.addTransaction(-200);

        assertEquals(-150, cashMachine.withdrawalAverage(), 0.1);
    }
}
