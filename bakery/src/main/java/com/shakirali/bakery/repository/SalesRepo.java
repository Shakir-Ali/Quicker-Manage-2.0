package com.shakirali.bakery.repository;

import com.shakirali.bakery.entity.Cashier;
import com.shakirali.bakery.entity.Sales;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SalesRepo extends JpaRepository<Sales, Integer> {

}

