package com.dliu.refactoring.chapter6.extractmethod;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Customer {
    protected static final Logger logger = LoggerFactory.getLogger(Customer.class);
    
    private String _name;

    public Customer(String _name) {
        this._name = _name;
    }

    void printOwning(double amount) {
        printBanner();
        printDetails(amount);

    }

    private void printDetails(double amount) {
        //print details
        logger.info("name:" + _name);
        logger.info("amount:" + amount);
    }

    private void printBanner() {
        logger.info("Summary:");
    }
}
