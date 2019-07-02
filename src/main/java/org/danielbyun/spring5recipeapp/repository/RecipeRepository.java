package org.danielbyun.spring5recipeapp.repository;

import org.danielbyun.spring5recipeapp.model.Recipe;
import org.springframework.data.repository.CrudRepository;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}
