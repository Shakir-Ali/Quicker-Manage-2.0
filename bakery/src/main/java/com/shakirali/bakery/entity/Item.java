package com.shakirali.bakery.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@Entity
@Table(name = "ITEM")
public class Item {

    @Id
    @Column(name = "CODE", length = 30)
    private String code;

    @Column(name = "NAME", length = 30, nullable = false)
    private String name;

    @Column(name = "PRICE", precision = 5, scale = 2, nullable = false)
    private BigDecimal price;

    @Column(name = "STOCK")
    private Integer stock;

    // Getters and Setters
}
