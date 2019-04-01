package com.tfi.OC_JavaObj.shop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RelayDeliveryTest {

    @Test
    public void Given_FreeRelay_WhenGettingDeliveryPrice_ThenGet0e() {
        Delivery delivery = new RelayDelivery(5.0);
        assertEquals(0.0, delivery.getPrice(), 0.01);
    }

    @Test
    public void Given_FreeRelay_WhenGettingDeliveryPrice_ThenGet0e() {
        Delivery delivery = new RelayDelivery(27);
        assertEquals(2.99, delivery.getPrice(), 0.01);
    }

    @Test
    public void Given_FreeRelay_WhenGettingDeliveryPrice_ThenGet0e() {
        Delivery delivery = new RelayDelivery(52);
        assertEquals(4.99, delivery.getPrice(), 0.01);
    }

}