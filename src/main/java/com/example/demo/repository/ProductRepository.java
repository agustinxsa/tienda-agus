package com.example.demo.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

import com.example.demo.models.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ProductRepository {
  private List<Product> products = new ArrayList<>();
  
  @Autowired
  public ProductRepository () {
  }

  public List<Product> getAllProducts() {
    return this.products;
  }

  public Product getProductById(long id) {
    return products.stream()
            .filter(products -> products.getId() == id)
            .findFirst()
            .orElseThrow(()-> new NoSuchElementException("DIABLOOOO NO HAY PRODUCTO CON ESE ID"));
  }

  public boolean createProduct(Product product) {
    return products.add(product);
  }
}
