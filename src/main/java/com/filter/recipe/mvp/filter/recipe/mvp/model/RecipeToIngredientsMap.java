package com.filter.recipe.mvp.filter.recipe.mvp.model;

import jakarta.persistence.*;

public class RecipeToIngredientsMap {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "recipe", nullable = false)
    private Recipe recipe;

    @ManyToOne
    @JoinColumn(name = "ingredient", nullable = false)
    private Ingredient ingredient;

    // Getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Recipe getRecipe() {
        return recipe;
    }

    public void setRecipe(Recipe recipe) {
        this.recipe = recipe;
    }

    public Ingredient getIngredient() {
        return ingredient;
    }

    public void setIngredient(Ingredient ingredient) {
        this.ingredient = ingredient;
    }
}
