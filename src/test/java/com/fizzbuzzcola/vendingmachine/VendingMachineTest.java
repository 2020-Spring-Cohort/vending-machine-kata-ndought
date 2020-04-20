package com.fizzbuzzcola.vendingmachine;

import org.assertj.core.api.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class VendingMachineTest {

    private Object Coin;

    @Test
    public void vendingMachineAcceptsNickles() {
        //Arrange
        VendingMachine vendingMachine = new VendingMachine();
        Coin nickleCoin = new Coin("Cupro-Nickle", .835);
        //Assert
        assertEquals(.05, vendingMachine.acceptsNickles(nickleCoin));
    }

    @Test
    public void vendingMachineAcceptsDimes() {
        VendingMachine vendingMachine = new VendingMachine();
        Coin dimeCoin = new Coin("Cupro-Nickle", .705);
        assertEquals(.10, vendingMachine.acceptsDimes(dimeCoin));
    }

    @Test
    public void vendingMachineAcceptsQuarters() {
        VendingMachine vendingMachine = new VendingMachine();
        Coin quarterCoin = new Coin("Cupro-Nickle", .955);
        assertEquals(.25, vendingMachine.acceptsQuarters(quarterCoin));
    }


}
