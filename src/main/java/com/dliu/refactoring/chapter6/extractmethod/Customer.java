package com.dliu.refactoring.chapter6.extractmethod;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Enumeration;
import java.util.Vector;

public class Customer {
    protected static final Logger logger = LoggerFactory.getLogger(Customer.class);
    private Vector<Order>  _orders = new Vector<>();
    
    private String _name;

    public Customer(String _name) {
        this._name = _name;
    }

    public void addOrder(Order order) {
        _orders.add(order);
    }

    void printOwing() {
        Enumeration e = _orders.elements();
        double outstanding = 0.0d;

         // print banner
        logger.info("********************************");
        logger.info("******** Customer Owes *********");
        logger.info("********************************");

        // calculate outstanding
        while (e.hasMoreElements()) {
            outstanding += ((Order) e.nextElement()).getAmount();
        }

        //print details
        logger.info("name:" + _name);
        logger.info("amount:" + outstanding);

    }

}
