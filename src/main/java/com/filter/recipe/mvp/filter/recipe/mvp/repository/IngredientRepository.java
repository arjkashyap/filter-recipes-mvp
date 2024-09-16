package com.filter.recipe.mvp.filter.recipe.mvp.repository;

import com.filter.recipe.mvp.filter.recipe.mvp.model.Ingredient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IngredientRepository extends JpaRepository<Ingredient, Long> {
}
