package com.dliu.refactoring.chapter6.extractmethod;

public class Order {
    private double amount;

    public Order(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }
}
