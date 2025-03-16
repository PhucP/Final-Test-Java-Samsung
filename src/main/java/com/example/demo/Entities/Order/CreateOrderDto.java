package com.example.demo.Entities.Order;

import java.util.List;

import com.example.demo.Entities.Product.Product;
import com.example.demo.Entities.User.User;

public class CreateOrderDto {
    public User user;
    public List<Product> products;
}
