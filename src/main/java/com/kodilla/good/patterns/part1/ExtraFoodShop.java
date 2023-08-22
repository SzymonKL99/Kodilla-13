package com.kodilla.good.patterns.part1;

public class ExtraFoodShop implements Producer {
    @Override
    public boolean process(Order order) {
        System.out.println("Processing order for ExtraFoodShop...");
        int availableStock = 100;
        if (availableStock >= order.getQuantity()) {
            System.out.println("Order successfully processed by ExtraFoodShop");
            return true;
        }else {
            System.out.println("Insufficient stock at ExtraFoodShop");
            return false;
        }
    }
}
