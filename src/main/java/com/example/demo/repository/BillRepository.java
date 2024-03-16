package com.example.demo.repository;

import com.example.demo.models.Bill;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class BillRepository {
    private final Map<Long, Bill> bills = new HashMap<>();
    private long nextId = 1;

    @Autowired
    public BillRepository() {
    }

    public Bill save(Bill bill) {
        if (bill.getId() == 0) {
            bill.setId(nextId++);
        }
        this.bills.put(bill.getId(), bill);
        return bill;
    }

    public Bill findBillById(long id) {
        return this.bills.get(id);
    }

    public List<Bill> findBillsByClientId(long clientId) {
        List<Bill> result = new ArrayList<>();
        for (Bill bill : bills.values()) {
            if (bill.getClientId() == clientId) {
                result.add(bill);
            }
        }
        return result;
    }
}
