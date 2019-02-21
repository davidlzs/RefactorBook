package com.dliu.refactor.domain;

public abstract class Movie {

    private String _title;

    public Movie(String _title) {
        this._title = _title;
    }

    public String getTitle() {
        return _title;
    }


    public abstract double getCharge(int daysRented);

    public int getFrequentRenterPoints(int daysRented) {
        return 1;
    }
}
