package com.shakirali.bakery.controller;

import com.shakirali.bakery.entity.Admin;
import com.shakirali.bakery.repository.AdminRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@CrossOrigin
public class AdminController {

    @Autowired
    AdminRepo adminRepo;

    @GetMapping("/admin/{id}")
    public Admin getAdminById(@PathVariable String id) {
        return adminRepo.findById(id).orElse(null);
    }
}
