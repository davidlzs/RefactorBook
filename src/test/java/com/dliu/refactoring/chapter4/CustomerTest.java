package com.dliu.refactoring.chapter4;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CustomerTest {
    @Test
    public void statement() {
        // setup
        String expected = "Rental Record for Judy Joe\n" +
                "\tGone with the wind\t5.0\n" +
                "\tThe Wandering Earth\t6.0\n" +
                "\tToy Story\t4.0\n" +
                "Amount owed is 15.0\n" +
                "You earned 4 frequent renter points";

        Customer customer = new Customer("Judy Joe");
        Movie movie1 = new Movie("Gone with the wind", Movie.REGULAR);
        Rental rental1 = new Rental(movie1, 4);
        customer.addRental(rental1);
        Movie movie2 = new Movie("The Wandering Earth", Movie.NEW_RELEASE);
        Rental rental2 = new Rental(movie2, 2);
        customer.addRental(rental2);
        Movie movie3 = new Movie("Toy Story", Movie.CHILDREN);
        Rental rental3 = new Rental(movie3, 5);
        customer.addRental(rental3);

        // execute
        String actual = customer.statement();

        // assert
        assertEquals(expected, actual);
    }

    @Test
    public void htmlStatement() {
        // setup
        String expected = "<h1>Rental Record for <em>Judy Joe</em></h1><br>\tGone with the wind\t5.0<br>\tThe Wandering Earth\t6.0<br>\tToy Story\t4.0<br><p>Amount owed is <em>15.0</em><p>You earned <em>4</em> frequent renter points<p>";

        Customer customer = new Customer("Judy Joe");
        Movie movie1 = new Movie("Gone with the wind", Movie.REGULAR);
        Rental rental1 = new Rental(movie1, 4);
        customer.addRental(rental1);
        Movie movie2 = new Movie("The Wandering Earth", Movie.NEW_RELEASE);
        Rental rental2 = new Rental(movie2, 2);
        customer.addRental(rental2);
        Movie movie3 = new Movie("Toy Story", Movie.CHILDREN);
        Rental rental3 = new Rental(movie3, 5);
        customer.addRental(rental3);

        // execute
        String actual = customer.htmlStatement();

        // assert
        assertEquals(expected, actual);
    }
}