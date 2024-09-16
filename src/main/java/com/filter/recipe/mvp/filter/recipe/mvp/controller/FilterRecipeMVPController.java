package com.filter.recipe.mvp.filter.recipe.mvp.controller;

import com.filter.recipe.mvp.filter.recipe.mvp.model.DTO.RecipeDTO;
import com.filter.recipe.mvp.filter.recipe.mvp.service.RecipeProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api/v1.0/")
public class FilterRecipeMVPController {

    private final RecipeProviderService recipeProvider;

    @Autowired
    public FilterRecipeMVPController(RecipeProviderService recipeProvider) {
        this.recipeProvider = recipeProvider;
    }

    @GetMapping(value = "hello")
    public String helloAPI() {
        return "hello world !!";
    }

    @GetMapping(value = "recipes")
    public List<RecipeDTO> getAllRecipes() {
        return recipeProvider.getAllRecipes();
    }

    @GetMapping(value = "recipe/{id}")
    public RecipeDTO getRecipeById(@PathVariable String id) {
        return recipeProvider.getRecipeById(String.format("recipe_%s", id));
    }

    //
    @PostMapping(value = "recipe/{ingredients}")
    public RecipeDTO getRecipeByIngredients(String ingredients){
        return recipeProvider.getRecipeByIngredients(Arrays.asList(ingredients.trim().split(",")));
    }
}
