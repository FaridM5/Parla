package com.practice.java.coffeshop;

public enum Fee {
    FEE(2.5);

    private final double fee;

    Fee(double fee) {
        this.fee = fee;
    }

    public double getFee() {
        return fee;
    }
}
