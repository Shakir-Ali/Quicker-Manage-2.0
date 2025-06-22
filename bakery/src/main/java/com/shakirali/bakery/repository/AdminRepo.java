package com.shakirali.bakery.repository;

import com.shakirali.bakery.entity.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminRepo extends JpaRepository<Admin, String> {

    // Custom query methods can be defined here if needed
    // For example, to find an admin by ID:
    // Optional<Admin> findById(String id);

    // Or to find an admin by name:
    // List<Admin> findByName(String name);
}
