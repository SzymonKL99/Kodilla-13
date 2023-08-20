package com.kodilla.good.patterns.challenges;

public interface OrderService<T> {
    boolean order(User user, T product );
}
