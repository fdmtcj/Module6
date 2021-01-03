package com.kodilla.good.patterns.allegro;

public class Order {

    private String type;
    private String orderNumber;
    private double price;

    public Order(String type, String orderNumber, double price) {
        this.type = type;
        this.orderNumber = orderNumber;
        this.price = price;
    }
}
