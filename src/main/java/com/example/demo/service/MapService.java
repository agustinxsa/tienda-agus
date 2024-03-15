package com.example.demo.service;

import com.example.demo.dto.ProductDto;
import com.example.demo.models.Product;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MapService {
  private final ModelMapper modelMapper;

  @Autowired
  public MapService (ModelMapper modelMapper) {
    this.modelMapper = modelMapper;
  }

  public Product map(ProductDto dto, Class<Product> productClass) {
    return modelMapper.map(dto, productClass);
  }

  public ProductDto map(Product product, Class<ProductDto> productDtoClass) {
    return modelMapper.map(product, productDtoClass);
  }

}