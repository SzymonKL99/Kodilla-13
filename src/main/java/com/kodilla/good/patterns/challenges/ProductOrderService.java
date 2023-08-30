package com.kodilla.good.patterns.challenges;

public class ProductOrderService<T> implements OrderService<T> {
    private InformationService informationService;
    private OrderRepository<T> orderRepository;
    private ProductRepository<T> productRepository;

    public ProductOrderService(InformationService informationService, OrderRepository<T> orderRepository,
                               ProductRepository<T> productRepository) {
        this.informationService = informationService;
        this.orderRepository = orderRepository;
        this.productRepository = productRepository;
    }

    @Override
    public boolean order(User user, T product) {
        int availableQuantity = productRepository.getAvailableQuantity(product);

        if (availableQuantity > 0) {
            informationService.inform(user);
            orderRepository.creatOrder(user, product);
            productRepository.decreaseQuantity(product);
            return true;
        } else {
            return false;
        }
    }
}
