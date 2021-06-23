package com.kodilla.bank.homework;

public class CashMachine {
    private int[] transactions;
    private int size;
    private int sum;

    public CashMachine() {
        this.size = 0;
        this.transactions = new int[0];
    }

    public void addTransaction(int amount) {

        if ((getBalance()) + amount >= 0) {
            this.size++;
            int[] newTab = new int[size];
            System.arraycopy(transactions, 0, newTab, 0, transactions.length);
            newTab[size - 1] = amount;
            this.transactions = newTab;
        } else {
            System.out.println("Amount of money in cash machine is less than 0");
        }
    }

    public int getBalance() {
        int sum = 0;
        for (int i = 0; i < transactions.length; i++) {
            sum += transactions[i];
        }
        return sum;
    }

    public int[] getTransactions() {
        return transactions;
    }

    public int numberOfDeposit() {
        int count = 0;
        for (int i = 0; i < transactions.length; i++) {
            if(transactions[i] > 0) {
                count++;
            }
        }
        return count;
    }

    public int numberOfWithdrawal() {
        int subtraction = 0;
        for (int i = 0; i < transactions.length; i++) {
            if(transactions[i] < 0) {
                subtraction++;
            }
        }
        return subtraction;
    }

    public double depositAverage(){
        int sum = 0;
        int count = 0;
        for (int i = 0; i < transactions.length; i++) {
            if(transactions[i] > 0) {
                sum += transactions[i];
                count++;
            }
        }
        return sum / count;
    }
    public double withdrawalAverage(){
        int sum = 0;
        int count = 0;
        for (int i = 0; i < transactions.length; i++) {
            if(transactions[i] < 0) {
                sum += transactions[i];
                count++;
            }
        }
        return sum / count;
    }



}

