package com.shakirali.bakery.controller;

import com.shakirali.bakery.entity.Sales;
import com.shakirali.bakery.service.SalesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class SalesController {

    @Autowired
    private SalesService salesService;

    @GetMapping("/sales")
    public ResponseEntity<List<Sales>> getAllSales() {
        return new ResponseEntity<>(salesService.getAllSales(),  HttpStatus.OK);
    }

}
