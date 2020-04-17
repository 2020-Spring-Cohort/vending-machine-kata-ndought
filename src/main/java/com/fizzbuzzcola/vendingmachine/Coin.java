package com.fizzbuzzcola.vendingmachine;

public class Coin {

    public String coinName;

    public double coinValue;


    public Coin(String coinName, double coinValue) {
        this.coinName = coinName;
        this.coinValue = coinValue;
    }

    public String getCoinName() {
        return coinName;
    }

    public double getCoinValue() {
        return coinValue;
    }
}
