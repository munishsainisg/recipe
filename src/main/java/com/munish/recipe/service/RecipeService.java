package com.munish.recipe.service;

import java.util.Set;

import com.munish.recipe.domain.Recipe;

public interface RecipeService {
	Set<Recipe> getRecipes();
	Recipe findById(Long id);
}
