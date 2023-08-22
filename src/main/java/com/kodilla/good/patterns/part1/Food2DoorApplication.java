package com.kodilla.good.patterns.part1;

public class Food2DoorApplication {
    public static void main(String[] args) {
            Producer extraFoodShop = new ExtraFoodShop();
            Producer healthyShop = new HealthyShop();
            Producer glutenFreeShop = new GlutenFreeShop();

            Order order1 = new Order("ExtraFoodShop", "Apples", 10);
            Order order2 = new Order("HealthyShop", "Lettuce", 5);
            Order order3 = new Order("GlutenFreeShop", "Gluten-Free Bread", 2);

            boolean result1 = extraFoodShop.process(order1);
            boolean result2 = healthyShop.process(order2);
            boolean result3 = glutenFreeShop.process(order3);


            displayOrderResult(order1, result1);
            displayOrderResult(order2, result2);
            displayOrderResult(order3, result3);
    }

        private static void displayOrderResult(Order order, boolean result) {
                String producer = order.getProducer();
                String product = order.getProduct();
                int quantity = order.getQuantity();

                if (result) {
                        System.out.println("Order from " + producer + " for " + quantity + " " + product + " was successful.");
                } else {
                        System.out.println("Order from " + producer + " for " + quantity + " " + product + " could not be fulfilled.");
                }
        }
}




