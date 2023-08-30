package com.kodilla.good.patterns.challenges;

import java.util.HashMap;
import java.util.Map;

public class ProductRepository<T> {
    private Map<T, Integer> availableQuantities;

    public ProductRepository() {
        this.availableQuantities = new HashMap<>();
    }

    public void addProduct(T product, int initialQuantity) {
        availableQuantities.put(product, initialQuantity);
    }

    public int getAvailableQuantity(T product) {
        return availableQuantities.getOrDefault(product, 0);
    }

    public void decreaseQuantity(T product) {
        int currentQuantity = availableQuantities.getOrDefault(product, 0);
        if (currentQuantity > 0) {
            availableQuantities.put(product, currentQuantity - 1);
        }
    }
}
