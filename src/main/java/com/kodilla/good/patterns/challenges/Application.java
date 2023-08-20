package com.kodilla.good.patterns.challenges;

public class Application {
    public static void main (String[] args) {
        User user = new User("Szymon", "Lipa");
        String product = "Bike";

        InformationService informationService = new ProductInformationService();
        OrderRepository<String> orderRepository = new ProductOrderRepository<>();
        OrderService<String> orderService = new ProductOrderService<>(informationService, orderRepository);

        boolean isOrdered = orderService.order(user, product);
        System.out.printf("Order successful:%s%n", isOrdered);


    }
}
