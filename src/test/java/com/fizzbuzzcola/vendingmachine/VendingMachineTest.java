package com.fizzbuzzcola.vendingmachine;

import org.junit.jupiter.api.BeforeEach;

public class VendingMachineTest {

    VendingMachine underTest;

    Coin testCoin;

    @BeforeEach
    public void setUp() {
        underTest = new VendingMachine("Doritos", .75, .25);
    }


}
