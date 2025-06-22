package com.shakirali.bakery.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "CASHIER")
public class Cashier {

    @Id
    @Column(name = "ID", length = 30)
    private String id;

    @Column(name = "NAME", length = 30, nullable = false)
    private String name;

    @Column(name = "EMAIL", length = 60, nullable = false)
    private String email;

    @Column(name = "MOBILE", nullable = false)
    private Long mobile;

    @Column(name = "PASS", length = 30)
    private String pass;

    // Getters and Setters
}

