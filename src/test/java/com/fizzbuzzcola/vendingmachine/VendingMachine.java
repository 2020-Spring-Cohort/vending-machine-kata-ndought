package com.fizzbuzzcola.vendingmachine;

import org.junit.jupiter.api.BeforeEach;

public class VendingMachine {

    public String product;

    public double price;

    public double changeGiven;


    public VendingMachine(String product, double price, double changeGiven) {
        this.product = product;
        this.price = price;
        this.changeGiven = changeGiven;
    }

    public String getProduct() {
        return product;
    }

    public double getPrice() {
        return price;
    }

    public double getChangeGiven() {
        return changeGiven;
    }
}
