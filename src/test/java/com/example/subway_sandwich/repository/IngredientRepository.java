package com.example.subway_sandwich.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.subway_sandwich.entity.Ingredient;


public interface IngredientRepository extends JpaRepository<Ingredient, Long> {
}

