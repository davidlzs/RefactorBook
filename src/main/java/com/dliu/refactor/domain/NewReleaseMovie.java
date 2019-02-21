package com.dliu.refactor.domain;

public class NewReleaseMovie extends Movie {
    public NewReleaseMovie(String _title) {
        super(_title);
    }

    @Override
    public double getCharge(int daysRented) {
        return daysRented *  3;
    }

    @Override
    public int getFrequentRenterPoints(int daysRented) {
        return daysRented > 1 ? 2 : 1;
    }
}
