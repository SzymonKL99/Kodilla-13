package com.kodilla.good.patterns.part1;

import java.util.Arrays;
import java.util.List;

public class HealthyShop implements Producer {
    public boolean process(Order order) {
        System.out.println("Processing order for HealthyFood...");

        boolean isAvailable = checkProductAvailability(order.getProduct());
        if (isAvailable) {
            System.out.println("Order successfully processed by HealthyShop");
            return true;
        } else {
            System.out.println("Product not available at HealthyShop");
            return false;
        }
    }
        private boolean checkProductAvailability(String product) {
            List<String> availableProducts = Arrays.asList("Lettuce", "Spinach", "Kale", "Carrots");
            return availableProducts.contains(product);
        }

    }

