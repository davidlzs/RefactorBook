package com.dliu.refactor.domain;

public class Movie {
    public static final int CHILDREN = 2;
    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;

    private String _title;

    private Price _price;

    public Movie(String _title, int _priceCode) {
        this._title = _title;
        this.setPriceCode(_priceCode);
    }

    public String getTitle() {
        return _title;
    }

    public int getPriceCode() {
        return _price.getPriceCode();
    }

    private void setPriceCode(int priceCode) {
        switch (priceCode) {
            case Movie.REGULAR:
                _price = new RegularPrice();
                break;
            case Movie.NEW_RELEASE:
                _price = new NewReleasePrice();
                break;
            case Movie.CHILDREN:
                _price = new ChildrenPrice();
                break;
            default:
                throw new IllegalArgumentException("Incorrect price code: " + priceCode);
        }
    }

    public double getCharge(int daysRented) {
        double result = 0;
        switch (getPriceCode()) {
            case Movie.REGULAR:
                result += 2;
                if (daysRented > 2)
                    result += (daysRented - 2) * 1.5;
                break;
            case Movie.NEW_RELEASE:
                result += daysRented *  3;
                break;
            case Movie.CHILDREN:
                result += 1;
                if (daysRented > 3)
                    result += (daysRented - 3) * 1.5;
                break;
        }
        return result;
    }

    public int getFrequentRenterPoints(int daysRented) {

        int frequentRenterPoints = 0;
        frequentRenterPoints ++;
        if ((getPriceCode() == Movie.NEW_RELEASE) && daysRented > 1)
            frequentRenterPoints++;
        return frequentRenterPoints;
    }
}
