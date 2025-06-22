package com.shakirali.bakery.repository;

import com.shakirali.bakery.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepo extends JpaRepository<Item, String> {

    // Custom query methods can be defined here if needed
    // For example, to find an item by ID:
    // Optional<Item> findById(String id);

    // Or to find items by name:
    // List<Item> findByName(String name);
}
