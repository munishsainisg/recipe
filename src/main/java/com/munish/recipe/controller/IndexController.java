package com.munish.recipe.controller;

import java.util.Optional;
import java.util.Set;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.munish.recipe.domain.Category;
import com.munish.recipe.domain.Recipe;
import com.munish.recipe.domain.UnitOfMeasure;
import com.munish.recipe.repository.CategoryRepository;
import com.munish.recipe.repository.UnitOfMeasureRepository;
import com.munish.recipe.service.RecipeService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class IndexController {

	private final RecipeService recipeService;

	public IndexController(RecipeService recipeService) {
		this.recipeService = recipeService;
	}

	@RequestMapping({ "", "/", "/index" })
	public String getIndexPage(Model model) {

		/*
		 * Optional<Category> categoryOptional =
		 * categoryRepository.findByDescription("Mexican"); Optional<UnitOfMeasure>
		 * unitOfMeasureOptional = unitOfMeasureRepository.findByDescription("Pinch");
		 * 
		 * System.out.println(categoryOptional.isPresent());
		 * //System.out.println(categoryOptional.get().getId());
		 * System.out.println(unitOfMeasureOptional.get().getId());
		 */
		//log.debug("munish log");
		Set<Recipe> recipes = recipeService.getRecipes();
		model.addAttribute("recipes", recipes);

		return "index";
	}
}
