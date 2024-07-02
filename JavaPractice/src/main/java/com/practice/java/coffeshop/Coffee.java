package com.practice.java.coffeshop;

public enum Coffee {
    LATTE(3.5, "Latte", "Medium"),
    ESPRESSO(4.2, "Espresso", "Small"),
    CAPPUCCINO(3.5, "Cappucino", "Medium"),
    FLAT_WHITE(2.4, "Flat White", "Small"),
    AMERICANO(2.5, "Americano", "Medium");

    private final double price;
    private final String description;
    private final String size;

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public String getSize() {
        return size;
    }

    Coffee(double price, String description, String size) {
        this.price = price;
        this.description = description;
        this.size = size;
    }
}
