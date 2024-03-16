package com.example.demo.models;

import java.util.List;

public class Client {
    private long id;
    private String name;
    private String address;
    private List<Bill> bills;

    public Client(long id, String name, String address, List<Bill> bills) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.bills = bills;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Bill> getBills() {
        return bills;
    }

    public void setBills(List<Bill> bills) {
        this.bills = bills;
    }
}
