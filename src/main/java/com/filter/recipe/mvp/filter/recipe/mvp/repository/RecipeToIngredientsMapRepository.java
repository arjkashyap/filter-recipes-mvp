package com.filter.recipe.mvp.filter.recipe.mvp.repository;

import com.filter.recipe.mvp.filter.recipe.mvp.model.RecipeToIngredientsMap;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecipeToIngredientsMapRepository extends JpaRepository<RecipeToIngredientsMap, Long> {
}
