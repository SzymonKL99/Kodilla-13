package com.kodilla.good.patterns.challenges;

public class ProductOrderRepository<T> implements OrderRepository<T> {
    @Override
    public void creatOrder(User user, T product) {
        System.out.println("Creating an order for user " + user.getName() + " " + user.getSurname() +
                " with product: " + product.toString());
    }
}
