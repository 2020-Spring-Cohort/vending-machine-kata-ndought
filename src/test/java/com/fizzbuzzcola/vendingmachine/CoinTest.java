package com.fizzbuzzcola.vendingmachine;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CoinTest {

    Coin underTest;

    @BeforeEach
    public void setup() {
        underTest = new Coin("Cupro-Nickle", .835);
    }

    @Test
    public void coinsShouldHaveACertainSize() {
        underTest.getCoinSize();
        assertEquals(.835, underTest.getCoinSize());
    }

    @Test
    public void coinsShouldBeMadeOfCertainMetal() {
        underTest.getMetalType();
        assertEquals("Cupro-Nickle", underTest.getMetalType());
    }
}



