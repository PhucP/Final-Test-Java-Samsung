package com.example.demo.Services;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.demo.Entities.Product.CreateProductDto;
import com.example.demo.Entities.Product.Product;
import com.example.demo.Repositories.IProductRepo;

@Service
public class ProductService {
    private final IProductRepo productRepo;

    public ProductService(IProductRepo productRepo) {
        this.productRepo = productRepo;
    }

    public ResponseEntity create(CreateProductDto dto) {
        Product product = Product.builder()
            .name(dto.name)
            .description(dto.description)
            .price(dto.price)
            .image(dto.image)
            .build();
        
        productRepo.save(product);
        return ResponseEntity.ok(product);
    }

    public ResponseEntity delete(Long id){
        productRepo.deleteById(id);
        return ResponseEntity.ok().build();
    }

    //Todo: implement update method
}
