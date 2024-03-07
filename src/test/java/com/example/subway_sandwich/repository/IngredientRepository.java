package com.example.subway_sandwich.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.subway_sandwich.entity.Ingredient;

public interface IngredientRepository extends JpaRepository<Ingredient, Long> {
    Optional<Ingredient> findByName(String name);
    Optional<Ingredient> findBytype(String type);
    Optional<Ingredient> findByprice(boolean  price);
}

