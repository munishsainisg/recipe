package com.munish.recipe.service;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import javax.management.RuntimeErrorException;

import org.springframework.stereotype.Service;

import com.munish.recipe.domain.Recipe;
import com.munish.recipe.repository.RecipeRepository;

@Service
public class RecipeServiceImpl implements RecipeService {

	private final RecipeRepository recipeRepository;
	
	public RecipeServiceImpl(RecipeRepository recipeRepository) {
        this.recipeRepository = recipeRepository;
    }
	
	@Override
	public Set<Recipe> getRecipes() {
		Set<Recipe> recopeSet = new HashSet<>();
		recipeRepository.findAll().iterator().forEachRemaining(recopeSet::add);
		return recopeSet;
	}

	@Override
	public Recipe findById(Long id) {
		Optional<Recipe> recipeOptional = recipeRepository.findById(id);
		
		if (!recipeOptional.isPresent()) {
			throw new RuntimeException("Recipe not found");
		}
		
		return recipeOptional.get();
	}
	

}
