package com.kodilla.good.patterns.challenges;

public class ProductOrderService<T> implements OrderService<T> {
    private InformationService informationService;
    private OrderRepository<T> orderRepository;

    public ProductOrderService(InformationService informationService, OrderRepository<T> orderRepository) {
        this.informationService = informationService;
        this.orderRepository = orderRepository;
    }

    @Override
    public boolean order(User user, T product) {
        boolean isOrdered = true;


        if (isOrdered) {
            informationService.inform(user);
            orderRepository.creatOrder(user, product);
            return true;
        }else {
            return false;
        }
    }
}
