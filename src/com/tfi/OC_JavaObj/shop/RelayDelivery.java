package com.tfi.OC_JavaObj.shop;

public class RelayDelivery implements Delivery {
    private int number = 0;

    public RelayDelivery (int number) {
        this.number = number;
    }

    @Override
    public double getPrice() {
        if (number >= 1 && number <= 22) {
            return 0;
        }
        else if (number >= 22 && number <= 47) {
            return 2.99;
        }
        else {
            return 4.99;
        }
    }
}
