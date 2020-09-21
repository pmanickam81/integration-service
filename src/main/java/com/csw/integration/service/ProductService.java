package com.csw.integration.service;

import com.csw.integration.dao.ProductRepository;
import com.csw.integration.dao.model.Product;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Slf4j
@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository productRepository;

    public List<Product> findAll() {
        return productRepository.findAll();
    }

    public Optional<Product> findById(String id) {
        return productRepository.findById(id);
    }

    public Product save(Product stock) {
        return productRepository.save(stock);
    }

    public void deleteById(String id) {
        productRepository.deleteById(id);
    }
}
