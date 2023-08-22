package com.kodilla.good.patterns.part1;

public class Order {
    private String producer;
    private String product;
    private int quantity;

    public Order(String producer, String product, int quantity) {
        this.producer = producer;
        this.product = product;
        this.quantity = quantity;
    }
    public String getProducer() {
        return producer;
    }
    public String getProduct() {
        return product;
    }
    public int getQuantity() {
        return quantity;
    }
}
