package com.example.demo.service;

import com.example.demo.dto.BillDto;
import com.example.demo.dto.ProductDto;
import com.example.demo.models.Bill;
import com.example.demo.models.Product;
import com.example.demo.repository.BillRepository;
import com.example.demo.service.interfaces.IBillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class BillService implements IBillService {
    private final BillRepository billRepository;
    private final MapService mapService;

    @Autowired
    public BillService(BillRepository billRepository, MapService mapService) {
        this.billRepository = billRepository;
        this.mapService = mapService;
    }

    @Override
    public BillDto createBill(BillDto billDto) {
        Bill billToSave = mapService.dtoToEntity(billDto, Bill.class);
        billToSave = billRepository.save(billToSave);
        return mapService.entityToDto(billToSave, BillDto.class);
    }

    @Override
    public boolean addProductToBill(long billId, ProductDto productDto) {
        Bill billFound = billRepository.findBillById(billId);
        if (billFound == null) {
            return false;
        }
        Product productToAdd = mapService.dtoToEntity(productDto, Product.class);
        billFound.getProducts().add(productToAdd);
        billRepository.save(billFound);
        return true;
    }

    @Override
    public BillDto getBillById(long billId) {
        return mapService.entityToDto(billRepository.findBillById(billId), BillDto.class);
    }

    @Override
    public List<BillDto> getBillsByClient(long clientId) {
        List<Bill> bills = billRepository.findBillsByClientId(clientId);
        return bills.stream()
                .map(bill -> mapService.entityToDto(bill, BillDto.class))
                .collect(Collectors.toList());
    }
}
