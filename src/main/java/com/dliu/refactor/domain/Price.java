package com.dliu.refactor.domain;

public abstract class Price {
    abstract int getPriceCode();

    abstract double getCharge(int daysRented);
}
