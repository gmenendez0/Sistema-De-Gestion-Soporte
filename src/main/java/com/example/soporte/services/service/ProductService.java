package com.example.soporte.services.service;

import com.example.soporte.models.Product.Product;
import com.example.soporte.repositories.ProductRepository;

import java.util.Collection;

@org.springframework.stereotype.Service
public class ProductService extends Service<Product, Long>{
    public ProductService(ProductRepository repository) {
        super(repository);
    }

    public Collection<Product> getProducts() {
        return executeRepositorySupplierSafely(repository::findAll);
    }
}