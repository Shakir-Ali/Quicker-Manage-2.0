package com.shakirali.bakery.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Getter
@Setter
@Table(name = "SALES")
public class Sales {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // Add ID if not present in schema for uniqueness

    @Column(name = "SALES", precision = 6, scale = 2)
    private BigDecimal sales;

    @Column(name = "DATE")
    private LocalDate date;

    // Getters and Setters
}

