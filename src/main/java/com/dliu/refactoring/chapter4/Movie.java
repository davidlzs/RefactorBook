package com.dliu.refactoring.chapter4;

public class Movie {
    public static final int CHILDREN = 2;
    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;

    private String _title;

    Price _price;

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
        return _price.getCharge(daysRented);
    }
}
