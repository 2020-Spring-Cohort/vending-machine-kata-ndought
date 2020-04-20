package com.fizzbuzzcola.vendingmachine;

import java.util.List;

public class VendingMachine {

    public List<String> product;

    public double changeReceived;

    public double changeDue;

    public VendingMachine(double changeReceived, double changeDue) {
        this.changeReceived = changeReceived;
        this.changeDue = changeDue;
    }

    public double getChangeReceived() {
        return changeReceived;
    }

    public double getChangeDue() {
        return changeDue;
    }

    public double acceptsNickles(Coin nickleCoin) {
        return + .05;
    }

    public double acceptsDimes(Coin dimeCoin) {
        return + .10;
    }

    public double acceptsQuarters(Coin quarterCoin) {
        return + .25;
    }
}
