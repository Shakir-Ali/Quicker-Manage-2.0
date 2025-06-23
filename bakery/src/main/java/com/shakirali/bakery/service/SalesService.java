package com.shakirali.bakery.service;

import com.shakirali.bakery.entity.Sales;
import com.shakirali.bakery.repository.SalesRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SalesService {

    @Autowired
    private SalesRepo salesRepo;

    public List<Sales> getAllSales() {
        return salesRepo.findAll();
    }
}
