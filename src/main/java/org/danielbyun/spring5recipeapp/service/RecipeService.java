package org.danielbyun.spring5recipeapp.service;

import org.danielbyun.spring5recipeapp.command.RecipeCommand;
import org.danielbyun.spring5recipeapp.model.Recipe;

import java.util.Set;

public interface RecipeService {
    Set<Recipe> getRecipes();

    Recipe findById(Long id);

    RecipeCommand saveRecipeCommand(RecipeCommand command);
}
