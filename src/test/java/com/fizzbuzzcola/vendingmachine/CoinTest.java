package com.fizzbuzzcola.vendingmachine;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CoinTest {

    Coin nickleCoin;
    Coin dimeCoin;
    Coin quarterCoin;

    @BeforeEach
    public void setup() {
        Coin nickleCoin = new Coin("Cupro-Nickle", .835);
        Coin dimeCoin = new Coin("Cupro-Nickle", .705);
        Coin quarterCoin = new Coin("Cupro-Nickle", .955);
    }

    @Test
    public void coinsShouldHaveACertainSize() {
        Coin nickleCoin = new Coin("Cupro-Nickle", .835);
        nickleCoin.getCoinSize();
        assertEquals(.835, nickleCoin.getCoinSize());
    }

    @Test
    public void coinsShouldBeMadeOfCertainMetal() {
        Coin dimeCoin = new Coin("Cupro-Nickle", .705);
        dimeCoin.getMetalType();
        assertEquals("Cupro-Nickle", dimeCoin.getMetalType());
    }
}



