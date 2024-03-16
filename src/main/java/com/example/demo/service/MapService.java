package com.example.demo.service;

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

  public <D> D entityToDto(Object entity, Class<D> dtoClass) {
    return modelMapper.map(entity, dtoClass);
  }

  public <T> T dtoToEntity(Object dto, Class<T> entityClass) {
    return modelMapper.map(dto, entityClass);
  }

}