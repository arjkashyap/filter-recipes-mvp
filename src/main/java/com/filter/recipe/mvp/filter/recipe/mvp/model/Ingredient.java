package com.filter.recipe.mvp.filter.recipe.mvp.model;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Ingredient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(precision = 10, scale = 2)
    private Double price;

    @Column(name = "is_veg", nullable = false, columnDefinition = "boolean default false")
    private boolean isVeg = false;

    // Getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public boolean isVeg() {
        return isVeg;
    }

    public void setVeg(boolean isVeg) {
        this.isVeg = isVeg;
    }
}
