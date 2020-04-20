package com.fizzbuzzcola.vendingmachine;

import org.assertj.core.api.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class VendingMachineTest {

    private Object Coin;

    @Test
    public void vendingMachineCanAcceptNickles() {
        //Arrange
        VendingMachine vendingMachine = new VendingMachine();
        Coin nickle = new Coin("Cupro-Nickle", .835);
        //Assert
        assertEquals(.05, vendingMachine.acceptsCoins(nickle));
    }


}
