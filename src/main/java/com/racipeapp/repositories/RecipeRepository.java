package com.racipeapp.repositories;

import org.springframework.data.repository.CrudRepository;

import com.racipeapp.domain.Recipe;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {

}
