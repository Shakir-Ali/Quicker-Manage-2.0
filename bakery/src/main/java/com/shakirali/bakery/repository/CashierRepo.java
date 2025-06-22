package com.shakirali.bakery.repository;

import com.shakirali.bakery.entity.Cashier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CashierRepo extends JpaRepository<Cashier, String> {
}
