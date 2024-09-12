package com.filter.recipe.mvp.filter.ecipe.mvp.model;

public class RecipeDTO {

    public RecipeDTO() {}

    public RecipeDTO(String id, String name, String description, String rating, String tier) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.rating = rating;
        this.tier = tier;
    }

    private String id;
    private String name;
    private String description;
    private String rating;
    private String tier;

    public String getId() {
        return id;
    }

    public void setId(String id) {
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
}
