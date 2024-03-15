package com.example.demo.models;


public class Product {
  private String name;
  private long id;
  private float price;

  public Product(String name, long id, float price) {
    this.name = name;
    this.id = id;
    this.price = price;
  }

  public Product() {
  }

  public String getName() {
    return name;
  }

  public long getId() {
    return id;
  }

  public float getPrice() {
    return price;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setId(long id) {
    this.id = id;
  }

  public void setPrice(float price) {
    this.price = price;
  }
}
