package com.aga.krawczyk.api.services;



        import com.aga.krawczyk.api.model.Order;
        import com.aga.krawczyk.api.repository.OrderRepository;
        import org.springframework.stereotype.Service;

        import java.util.List;

@Service
public class OrderService{

    private OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }


    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }

}

