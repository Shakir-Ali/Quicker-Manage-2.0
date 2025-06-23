package com.shakirali.bakery.service;

import com.shakirali.bakery.entity.Admin;
import com.shakirali.bakery.repository.AdminRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminService {

    @Autowired
    private AdminRepo adminRepo;

    public Admin getAdminById(String id) {
        return adminRepo.findById(id).orElse(null);
    }

    public Admin saveAdmin(Admin admin) {
        return adminRepo.save(admin);
    }

    public void deleteAdmin(String id) {
        adminRepo.deleteById(id);
    }

    public Admin updateAdmin(Admin admin) {
        if (adminRepo.existsById(admin.getId())) {
            return adminRepo.save(admin);
        }
        return null; // or throw an exception
    }
}
