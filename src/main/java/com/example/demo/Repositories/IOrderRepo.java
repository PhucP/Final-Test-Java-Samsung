package com.example.demo.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entities.Order.Order;

public interface IOrderRepo extends JpaRepository<Order, Long>{

}
