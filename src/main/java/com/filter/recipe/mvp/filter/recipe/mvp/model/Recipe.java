package com.filter.recipe.mvp.filter.recipe.mvp.model;

import jakarta.persistence.*;

@Entity
public class Recipe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String description;

    @Column(name = "cover_image")
    private String coverImage;

    @Column(name = "rating")
    private String rating;

    @Column(name = "tier", nullable = false, columnDefinition = "varchar(255) default 'MEDIUM'")
    private String tier = "MEDIUM";

    @Column(name = "spices", nullable = false)
    private String spices;

    @Column(name = "ingredients_required_count", nullable = false, columnDefinition = "int default 0")
    private int ingredientsRequiredCount = 0;

    @Column(name = "ingredients_optional_count", nullable = false, columnDefinition = "int default 0")
    private int ingredientsOptionalCount = 0;

    @Column(name = "content", nullable = false)
    private String content;

    @Column(name = "veg", nullable = false)
    private boolean veg;

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCoverImage() {
        return coverImage;
    }

    public void setCoverImage(String coverImage) {
        this.coverImage = coverImage;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getTier() {
        return tier;
    }

    public void setTier(String tier) {
        this.tier = tier;
    }

    public String getSpices() {
        return spices;
    }

    public void setSpices(String spices) {
        this.spices = spices;
    }

    public int getIngredientsRequiredCount() {
        return ingredientsRequiredCount;
    }

    public void setIngredientsRequiredCount(int ingredientsRequiredCount) {
        this.ingredientsRequiredCount = ingredientsRequiredCount;
    }

    public int getIngredientsOptionalCount() {
        return ingredientsOptionalCount;
    }

    public void setIngredientsOptionalCount(int ingredientsOptionalCount) {
        this.ingredientsOptionalCount = ingredientsOptionalCount;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public boolean isVeg() {
        return veg;
    }

    public void setVeg(boolean veg) {
        this.veg = veg;
    }
}
