package com.kodilla.good.patterns.challenges;

public interface OrderRepository<T> {
    void creatOrder(User user, T product);
}
