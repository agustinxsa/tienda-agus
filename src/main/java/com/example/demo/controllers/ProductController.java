package com.example.demo.controllers;

import java.util.List;

import com.example.demo.dto.ProductDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.service.ProductService;

@RestController
public class ProductController {

  private final ProductService productService;

  @Autowired
  public ProductController(ProductService productService) {
    this.productService = productService;
  }

  @GetMapping("/products")
  public List<ProductDto> getAllProducts() {
    return productService.getAllProducts();

  }

  @GetMapping("/products/{id}")
  public ProductDto getProductById(@PathVariable long id) {
    return productService.getProductById(id);

  }

  @PostMapping("/products")
  public boolean createProduct(@RequestBody ProductDto product) {
    return productService.createProduct(product);
  }


}