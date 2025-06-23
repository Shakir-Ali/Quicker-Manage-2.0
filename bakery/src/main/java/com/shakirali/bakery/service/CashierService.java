package com.shakirali.bakery.service;

import com.shakirali.bakery.entity.Cashier;
import com.shakirali.bakery.repository.CashierRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CashierService {

    @Autowired
    private CashierRepo cashierRepo;

    public Cashier getCashierById(String id) {
        return cashierRepo.findById(id).orElse(null);
    }

    public Cashier saveCashier(Cashier cashier) {
        return cashierRepo.save(cashier);
    }

    public void deleteCashier(String id) {
        cashierRepo.deleteById(id);
    }

    public Cashier updateCashier(Cashier cashier) {
        if (cashierRepo.existsById(cashier.getId())) {
            return cashierRepo.save(cashier);
        }
        return null; // or throw an exception
    }
}
