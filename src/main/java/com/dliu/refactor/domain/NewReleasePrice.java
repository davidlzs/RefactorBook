package com.dliu.refactor.domain;

public class NewReleasePrice extends Price {
    public int getPriceCode() {
        return Movie.NEW_RELEASE;
    }

    @Override
    public double getCharge(int daysRented) {
        double result = daysRented * 3;
        return result;
    }

    @Override
    public int getFrequentRenterPoints(int daysRented) {
        return daysRented > 1 ? 2 : 1;
    }
}
