package com.goodstrade.goodstrade.Service;

import com.goodstrade.goodstrade.Model.Product;
import com.goodstrade.goodstrade.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> getAllProducts(){
        return productRepository.findAll();
    }

    public Product getProductDetailById(Long id) {
        return productRepository.findProductById(id);
    }
}
