package com.dliu.refactor.domain;

public class RegularPrice implements Price {
    public int getPriceCode() {
        return Movie.REGULAR;
    }
}
