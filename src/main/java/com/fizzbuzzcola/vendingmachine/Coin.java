package com.fizzbuzzcola.vendingmachine;

public class Coin {

    public String metalType;

    public double coinSize;


    public Coin(String metalType, double coinSize) {
        this.metalType = metalType;
        this.coinSize = coinSize;
    }

    public String getMetalType() {
        return metalType;
    }

    public double getCoinSize() {
        return coinSize;
    }
}
