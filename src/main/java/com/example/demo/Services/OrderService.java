package com.example.demo.Services;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.demo.Entities.Order.CreateOrderDto;
import com.example.demo.Entities.Order.Order;
import com.example.demo.Repositories.IOrderRepo;

@Service
public class OrderService {
    private final IOrderRepo orderRepo;

    public OrderService(IOrderRepo orderRepo) {
        this.orderRepo = orderRepo;
    }

    public ResponseEntity create(CreateOrderDto dto){
        Order order = Order.builder()
                            .user(dto.user)
                            .products(dto.products)
                            .build();
        return ResponseEntity.ok(order);
    }
}
