package com.example.demo.service.interfaces;

import com.example.demo.dto.ProductDto;

import java.util.List;

public interface IProductService {
    List<ProductDto> getAllProducts();
    ProductDto getProductById(long id);
    boolean createProduct(ProductDto product);
}
