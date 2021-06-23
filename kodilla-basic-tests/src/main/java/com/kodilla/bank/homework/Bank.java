package com.kodilla.bank.homework;

public class Bank {
    private CashMachine[] cashMachines;
    private int size;

    public Bank() {
        this.size = 0;
        this.cashMachines = new CashMachine[0];
    }

    public void addCashMachine(CashMachine cashMachine) {
        this.size++;
        CashMachine[] newTab = new CashMachine[size];
        System.arraycopy(cashMachines, 0, newTab, 0, cashMachines.length);
        newTab[size - 1] = cashMachine;
        this.cashMachines = newTab;
    }

    public int getBalance() {
        int sum = 0;
        for (CashMachine cashMachine : cashMachines) {
            sum += cashMachine.getBalance();
        }
        return sum;
    }

    public int numberOfDeposit() {
        int count = 0;
        for (CashMachine cashMachine : cashMachines) {
            count += cashMachine.numberOfDeposit();
        }
        return count;
    }

    public int numberOfWithdrawals() {
        int sum = 0;
        for (CashMachine cashMachine : cashMachines) {
            sum += cashMachine.numberOfWithdrawal();
        }
        return sum;
    }
    public double depositAverage() {
        if (this.cashMachines.length == 0) {
            return 0;
        }
        double sum = 0;
        for (int i = 0; i < cashMachines.length; i++) {
            sum += cashMachines[i].depositAverage();
        }
        return sum / cashMachines.length;
    }
}
