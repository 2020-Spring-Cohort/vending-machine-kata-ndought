package com.fizzbuzzcola.vendingmachine;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CoinTest {

    Coin underTest;

    @BeforeEach
    public void setup() {
        underTest = new Coin("nickel", .05);
    }

    @Test
    public void coinShouldHaveAValue() {
        underTest.getCoinValue();
        assertEquals(.05, underTest.getCoinValue());
    }
}
