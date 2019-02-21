package com.dliu.refactoring.chapter4;

public class ChildrenPrice extends Price {
    public int getPriceCode() {
        return Movie.CHILDREN;
    }

    @Override
    public double getCharge(int daysRented) {
        double result = 1;
        if (daysRented > 3)
            result += (daysRented - 3) * 1.5;
        return result;
    }
}
