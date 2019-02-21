package com.dliu.refactor.domain;

public class RegularMovie extends Movie {
    public RegularMovie(String _title) {
        super(_title);
    }

    @Override
    public double getCharge(int daysRented) {
        double result = 2;
        if (daysRented > 2)
            result += (daysRented - 2) * 1.5;

        return result;
    }
}
