package com.example.demo.dto;

public class ProductDto {
    public String name;
    public long id;
    public float price;

    public ProductDto(String name, long id, float price) {
        this.name = name;
        this.id = id;
        this.price = price;
    }

    public ProductDto() {
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

    public String getName() {
        return name;
    }

    public long getId() {
        return id;
    }

    public float getPrice() {
        return price;
    }
}
