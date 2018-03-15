package com.munish.recipe.repository;


import org.springframework.data.repository.CrudRepository;

import com.munish.recipe.domain.Recipe;

/**
 * Created by jt on 6/13/17.
 */
public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}
