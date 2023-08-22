package com.kodilla.good.patterns.part1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class GlutenFreeShop implements Producer {
    @Override
    public boolean process(Order order) {
        System.out.println("Processing order for GlutenFreeShop...");

        boolean isAvailable = checkProductAvailability(order.getProduct());
        if (isAvailable) {
            System.out.println("Order successfully processed by GlutenFreeShop");
            return true;
        } else {
            System.out.println("Product not available at GlutenFreeShop");
            return false;
        }
    }

    private boolean checkProductAvailability(String product) {
        Set<String> availableProducts = new HashSet<>(Arrays.asList("Gluten-Free Bread", "Gluten-Free Pasta", "Quinoa"));
        return availableProducts.contains(product);
    }
}
