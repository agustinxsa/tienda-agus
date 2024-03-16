package com.example.demo.service.interfaces;

import com.example.demo.dto.BillDto;
import com.example.demo.dto.ProductDto;


import java.util.List;

public interface IBillService {
    BillDto createBill(BillDto billDto);
    boolean addProductToBill(long billId, ProductDto productDto);
    BillDto getBillById(long billId);
    List<BillDto> getBillsByClient(long clientId);
}
