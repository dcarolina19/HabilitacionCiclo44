package com.example.habilitacion.repository;
import com.example.habilitacion.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ProductRepository {
    @Autowired
    private ProductCrudRepository productCrudRepository;

    public List<Product> getAll(){
        return productCrudRepository.findAll();
    }
    public Optional<Product> getProduct(String reference){
        return productCrudRepository.findById(reference);
    }
    public Product create(Product product){
        return productCrudRepository.save(product);
    }
    public void update(Product product){
        productCrudRepository.save(product);
    }
    public void delete(Product product){
        productCrudRepository.delete(product);
    }
    public List<Product> findByDescriptionContainingIgnoreCase(String description){
        return productCrudRepository.findByDescriptionContainingIgnoreCase(description);
    }

    public List<Product> findByPriceLessThanEqual(Double price){
        return productCrudRepository.findByPriceLessThanEqual(price);
    }
}

