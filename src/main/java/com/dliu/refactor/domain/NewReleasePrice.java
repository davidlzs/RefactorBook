package com.dliu.refactor.domain;

public class NewReleasePrice implements Price {
    public int getPriceCode() {
        return Movie.NEW_RELEASE;
    }
}
