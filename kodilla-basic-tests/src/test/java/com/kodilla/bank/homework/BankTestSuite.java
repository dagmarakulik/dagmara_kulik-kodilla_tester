package com.kodilla.bank.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BankTestSuite {

    @Test

    public void testGetBalance() {
        //given
        Bank bank = new Bank();
        CashMachine c1 = new CashMachine();
        c1.addTransaction(100);
        c1.addTransaction(-50);
        bank.addCashMachine(c1);
        CashMachine c2 = new CashMachine();
        c2.addTransaction(200);
        c2.addTransaction(-100);
        bank.addCashMachine(c2);
        // when
        int sum = bank.getBalance();
        // then
        Assertions.assertEquals(150, sum);
    }

    @Test

    public void testNumberOfDeposit() {
        Bank bank = new Bank();
        CashMachine c1 = new CashMachine();
        c1.addTransaction(100);
        c1.addTransaction(200);
        c1.addTransaction(-200);
        c1.addTransaction(400);
        bank.addCashMachine(c1);
        CashMachine c2 = new CashMachine();
        c2.addTransaction(400);
        c2.addTransaction(500);
        c2.addTransaction(-300);
        c2.addTransaction(-200);
        bank.addCashMachine(c2);
        int sum = bank.numberOfDeposit();
        Assertions.assertEquals(5, sum);
    }

    @Test

    public void shouldCorrectTestNumberOfDepositIfTransactionIsInvalid() {
        Bank bank = new Bank();
        CashMachine c1 = new CashMachine();
        c1.addTransaction(-100);
        c1.addTransaction(-300);
        c1.addTransaction(-200);
        c1.addTransaction(400);
        bank.addCashMachine(c1);
        CashMachine c2 = new CashMachine();
        c2.addTransaction(400);
        c2.addTransaction(500);
        c2.addTransaction(-300);
        c2.addTransaction(-200);
        bank.addCashMachine(c2);
        int sum = bank.numberOfDeposit();
        Assertions.assertEquals(3, sum);
    }

    @Test

    public void testNumberOfWithdrawal() {
        Bank bank = new Bank();
        CashMachine c1 = new CashMachine();
        c1.addTransaction(200);
        c1.addTransaction(300);
        c1.addTransaction(-200);
        c1.addTransaction(300);
        bank.addCashMachine(c1);
        CashMachine c2 = new CashMachine();
        c2.addTransaction(350);
        c2.addTransaction(10);
        c2.addTransaction(-200);
        c2.addTransaction(300);
        c2.addTransaction(300);
        bank.addCashMachine(c2);
        CashMachine c3 = new CashMachine();
        c3.addTransaction(200);
        c3.addTransaction(-100);
        c3.addTransaction(200);
        c3.addTransaction(-150);
        bank.addCashMachine(c3);
        int sum = bank.numberOfWithdrawals();
        Assertions.assertEquals(4, sum);
    }

    @Test

    public void shouldCountNumberOfWithdrawalIfTransactionIsInvalid() {
        Bank bank = new Bank();
        CashMachine c1 = new CashMachine();
        c1.addTransaction(-200);
        c1.addTransaction(300);
        c1.addTransaction(-200);
        c1.addTransaction(300);
        int sum = bank.numberOfWithdrawals();
        Assertions.assertEquals(0, sum);
    }

    @Test

    public void testDepositAverage() {
        Bank bank = new Bank();
        CashMachine c1 = new CashMachine();
        c1.addTransaction(100);
        c1.addTransaction(200);
        c1.addTransaction(200);
        c1.addTransaction(400);
        bank.addCashMachine(c1);
        CashMachine c2 = new CashMachine();
        c2.addTransaction(300);
        c2.addTransaction(300);
        c2.addTransaction(500);
        c2.addTransaction(500);
        bank.addCashMachine(c2);
        double average = bank.depositAverage();
        Assertions.assertEquals(312.5, average, 0.001);
    }

    @Test

    public void shouldReturnDepositAverageIfNoDeposit() {
        Bank bank = new Bank();
        double average = bank.depositAverage();
        Assertions.assertEquals(0.0, average);
    }
}
