package com.practice.java.coffeshop;

public enum Tea {
    BLACK(2.4, "Black Tea", "Medium"),
    GREEN(2.2, "Green Tea", "Small"),
    HERBAL(3.0, "Herbal Tea", "Medium");

    private final double price;
    private  final String description;
    private final String size;

    public double getPrice() {
        return price;
    }

    public String getSize() {
        return size;
    }

    public String getDescription() {
        return description;
    }

    Tea(double price, String description, String size) {
        this.price = price;
        this.description = description;
        this.size = size;
    }
}
