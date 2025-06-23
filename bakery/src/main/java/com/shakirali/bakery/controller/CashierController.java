package com.shakirali.bakery.controller;

import com.shakirali.bakery.entity.Cashier;
import com.shakirali.bakery.service.CashierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class CashierController {

    @Autowired
    private CashierService cashierService;

    @GetMapping("/cashier/{id}")
    public String getCashierById(@PathVariable String id) {
        return cashierService.getCashierById(id).toString();
    }

    @PostMapping("/cashier")
    public Cashier saveCashier(@RequestBody Cashier cashier) {
        return cashierService.saveCashier(cashier);
    }

    @DeleteMapping("/cashier/{id}")
    public void deleteCashier(@PathVariable String id) {
        cashierService.deleteCashier(id);
    }

    @PutMapping("/cashier")
    public Cashier updateCashier(@RequestBody Cashier cashier) {
        return cashierService.updateCashier(cashier);
    }


}
