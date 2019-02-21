package com.dliu.refactor.domain;

public class ChildrenMovie extends Movie {
    public ChildrenMovie(String _title) {
        super(_title);
    }

    @Override
    public double getCharge(int daysRented) {
        double result = 1;
        if (daysRented > 3)
            result += (daysRented - 3) * 1.5;
        return result;
    }
}
