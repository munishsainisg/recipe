package com.munish.recipe.repository;


import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.munish.recipe.domain.UnitOfMeasure;

/**
 * Created by jt on 6/13/17.
 */
public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure, Long> {
	
	Optional <UnitOfMeasure> findByDescription(String description);
}
