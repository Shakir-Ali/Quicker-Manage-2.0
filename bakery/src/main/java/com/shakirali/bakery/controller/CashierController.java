package com.shakirali.bakery.controller;

import com.shakirali.bakery.entity.Cashier;
import com.shakirali.bakery.service.CashierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class CashierController {

    @Autowired
    private CashierService cashierService;


    @GetMapping("/cashier/{id}")
    public ResponseEntity<Cashier> getCashierById(@PathVariable String id) {
        return new ResponseEntity<>(cashierService.getCashierById(id), HttpStatus.OK);
    }

    @PostMapping("/cashier")
    public ResponseEntity<Cashier> saveCashier(@RequestBody Cashier cashier) {
        return new ResponseEntity<>(cashierService.saveCashier(cashier), HttpStatus.CREATED);
    }

    @DeleteMapping("/cashier/{id}")
    public ResponseEntity<String> deleteCashier(@PathVariable String id) {
        cashierService.deleteCashier(id);
        return new ResponseEntity<>("Cashier deleted successfully", HttpStatus.OK);
    }

    @PutMapping("/cashier")
    public ResponseEntity<Cashier> updateCashier(@RequestBody Cashier cashier) {
        return new ResponseEntity<>(cashierService.updateCashier(cashier), HttpStatus.OK);
    }


}
