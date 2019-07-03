package org.danielbyun.spring5recipeapp.service.impl;

import org.danielbyun.spring5recipeapp.model.Recipe;
import org.danielbyun.spring5recipeapp.repository.RecipeRepository;
import org.danielbyun.spring5recipeapp.service.RecipeService;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class RecipeServiceImpl implements RecipeService {
    private final RecipeRepository recipeRepository;

    public RecipeServiceImpl(RecipeRepository recipeRepository) {
        this.recipeRepository = recipeRepository;
    }

    @Override
    public Set<Recipe> getRecipes() {
        Set<Recipe> recipeSet = new HashSet<>();
        recipeRepository.findAll().iterator().forEachRemaining(recipeSet::add);
        return recipeSet;
    }
}
