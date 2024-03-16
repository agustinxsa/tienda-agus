package com.example.demo.dto;

import java.util.List;

public class BillDto {
    private long id;
    private long clientId;
    private List<ProductDto> products;

    public BillDto(long id, long clientId, List<ProductDto> products) {
        this.id = id;
        this.clientId = clientId;
        this.products = products;
    }

    public BillDto() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getClientId() {
        return clientId;
    }

    public void setClientId(long clientId) {
        this.clientId = clientId;
    }

    public List<ProductDto> getProducts() {
        return products;
    }

    public void setProducts(List<ProductDto> products) {
        this.products = products;
    }
}
