package com.example.demo.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entities.Product.Product;

public interface IProductRepo extends JpaRepository<Product, Long>{

}
