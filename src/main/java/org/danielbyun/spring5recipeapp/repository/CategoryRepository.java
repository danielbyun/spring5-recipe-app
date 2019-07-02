package org.danielbyun.spring5recipeapp.repository;

import org.danielbyun.spring5recipeapp.model.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category, Long> {
}
