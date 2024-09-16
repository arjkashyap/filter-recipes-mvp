package com.filter.recipe.mvp.filter.recipe.mvp.repository;

import com.filter.recipe.mvp.filter.recipe.mvp.model.Recipe;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecipeRepository extends JpaRepository<Recipe,Long> {
}
