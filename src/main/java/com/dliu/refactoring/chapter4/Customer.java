package com.dliu.refactoring.chapter4;


import java.util.Enumeration;
import java.util.Vector;

public class Customer {
    private String _name;
    private Vector<Rental> _rentals = new Vector<Rental>();

    public Customer(String name) {
        this._name = name;
    }

    public void addRental(Rental rental) {
        _rentals.add(rental);
    }

    public String getName() {
        return _name;
    }

    public String statement() {

        Enumeration rentals = _rentals.elements();
        String result = "Rental Record for " + getName() + "\n";
        while (rentals.hasMoreElements()) {
            Rental each = (Rental) rentals.nextElement();

            result += "\t" + each.getMovie().getTitle() + "\t" + String.valueOf(each.getCharge()) + "\n";
        }

        result += "Amount owed is " + String.valueOf(getTotalCharge()) + "\n";
        result += "You earned " + String.valueOf(getTotalFrequentRenterPoints()) + " frequent renter points";
        return result;
    }

    public String htmlStatement() {

        Enumeration rentals = _rentals.elements();
        String result = "<h1>Rental Record for <em>" + getName() + "</em></h1><br>";
        while (rentals.hasMoreElements()) {
            Rental each = (Rental) rentals.nextElement();

            result += "\t" + each.getMovie().getTitle() + "\t" + String.valueOf(each.getCharge()) + "<br>";
        }

        result += "<p>Amount owed is <em>" + String.valueOf(getTotalCharge()) + "</em><p>";
        result += "You earned <em>" + String.valueOf(getTotalFrequentRenterPoints()) + "</em> frequent renter points<p>";
        return result;
    }

    private double getTotalCharge() {
        double result = 0;
        Enumeration rentals = _rentals.elements();

        while (rentals.hasMoreElements()) {
            Rental each = (Rental) rentals.nextElement();
            result += each.getCharge();
        }
        return result;
    }

    private int getTotalFrequentRenterPoints() {
        int result = 0;
        Enumeration rentals = _rentals.elements();

        while (rentals.hasMoreElements()) {
            Rental each = (Rental) rentals.nextElement();

            result += each.getFrequentRenterPoints();
        }
        return result;
    }
}