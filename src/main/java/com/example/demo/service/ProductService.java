package com.example.demo.service;

import java.util.List;
import java.util.stream.Collectors;

import com.example.demo.dto.ProductDto;
import com.example.demo.models.Product;
import com.example.demo.repository.ProductRepository;
import com.example.demo.service.interfaces.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService implements IProductService {
  private final ProductRepository productRepository;
  private final MapService mapService;

  @Autowired
  public ProductService(ProductRepository productRepository, MapService mapService) {
    this.productRepository = productRepository;
    this.mapService = mapService;
  }

  public List<ProductDto> getAllProducts() {
    List<Product> allProducts = productRepository.getAllProducts();
    return allProducts.stream()
            .map(product -> mapService.entityToDto(product, ProductDto.class))
            .collect(Collectors.toList());
  }

  public ProductDto getProductById(long id) {
    Product product = productRepository.getProductById(id);
    return mapService.entityToDto(product, ProductDto.class);
  }

  public boolean createProduct(ProductDto product) {
    Product productToSave = mapService.dtoToEntity(product, Product.class);
    return productRepository.createProduct(productToSave);
  }
}
