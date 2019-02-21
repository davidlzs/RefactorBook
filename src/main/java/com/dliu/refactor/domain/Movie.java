package com.dliu.refactor.domain;

public abstract class Movie {
    public static final int CHILDREN = 2;
    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;

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
