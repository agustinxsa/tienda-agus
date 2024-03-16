package com.example.demo.models;

import java.util.ArrayList;
import java.util.List;

public class Bill {
    private long id;
    private long clientId;
    private List<Product> products;

    public Bill(long id, long clientId) {
        this.id = id;
        this.clientId = clientId;
        this.products = new ArrayList<>();
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

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}
