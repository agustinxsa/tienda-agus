package com.example.demo.controllers;

import com.example.demo.dto.BillDto;
import com.example.demo.dto.ProductDto;
import com.example.demo.service.BillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bill")
public class BillController {
    private final BillService billService;

    @Autowired
    public BillController(BillService billService) {
        this.billService = billService;
    }

    @PostMapping("/new-bill")
    public ResponseEntity<BillDto> createBill(@RequestBody BillDto billDto ) {
        return ResponseEntity.ok(billService.createBill(billDto));
    }


    @PostMapping("/{billId}")
    public ResponseEntity<Boolean> addProductToBill(@PathVariable long billId, @RequestBody ProductDto productDto) {
        return ResponseEntity.ok(billService.addProductToBill(billId, productDto));
    }

    @GetMapping("/{billId}")
    public ResponseEntity<BillDto> getBillById(@PathVariable long billId) {
        return ResponseEntity.ok(billService.getBillById(billId));
    }

    @GetMapping("/client/{clientId}")
    public ResponseEntity<List<BillDto>> getBillsByClientId(@PathVariable long clientId) {
        return ResponseEntity.ok(billService.getBillsByClient(clientId));
    }

}
