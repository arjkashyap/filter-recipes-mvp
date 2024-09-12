package com.filter.recipe.mvp.filter.ecipe.mvp.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.filter.recipe.mvp.filter.ecipe.mvp.model.RecipeDTO;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class RecipeProviderService {

    private final ObjectMapper mapper;

    public RecipeProviderService(ObjectMapper mapper) {
        this.mapper = mapper;
    }

    public List<RecipeDTO> getAllRecipes(){
        System.out.println("getAllRecipes called");
        List<RecipeDTO> recipes = null;
        try {
            recipes = mapper.readValue(Util.readResource("sample-db/recipes-list.json"), new TypeReference<List<RecipeDTO>>() {});

            return recipes;
        } catch (JsonProcessingException e) {
            System.out.println("Throw dedicated exception - " + e.getMessage());
        }
        return recipes;
    }

    public RecipeDTO getRecipeById(String id) {
        System.out.println("getRecipeById called " + id);
        RecipeDTO recipe = null;
        try {
            var recipes = mapper.readValue(Util.readResource("sample-db/recipes-list.json"), new TypeReference<List<RecipeDTO>>() {});
            recipe =  recipes.stream().filter(r -> r.getId().equals(id)).findFirst().orElse(null);
        } catch (Exception e) {
            System.out.println("Throw dedicated exception - " + e.getMessage());
        }
        return recipe;
    }

    public RecipeDTO getRecipeByIngredients(List<String> ingredients) {
        RecipeDTO recipe = null;

        return recipe;
    }
}
