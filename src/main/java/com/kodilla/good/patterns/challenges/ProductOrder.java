package com.kodilla.good.patterns.challenges;

public class ProductOrder<T> {
    private User user;
    private T product;

    public ProductOrder(User user, T product) {
        this.user = user;
        this.product = product;
    }

    public User getUser() {
        return user;
    }

    public T getProduct() {
        return product;
    }
}
