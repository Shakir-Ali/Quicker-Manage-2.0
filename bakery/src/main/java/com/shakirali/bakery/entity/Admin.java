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
@Table(name = "ADMIN")
public class Admin {

    @Id
    @Column(name = "ID", length = 30)
    private String id;

    @Column(name = "PASS", length = 30)
    private String pass;

    @Column(name = "NAME", length = 30)
    private String name;

    //To String method for better readability
    @Override
    public String toString() {
        return "Admin{" +
                "id='" + id + '\'' +
                ", pass='" + pass + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
