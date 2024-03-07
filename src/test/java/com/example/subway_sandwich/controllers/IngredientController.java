package com.example.subway_sandwich.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.subway_sandwich.entity.Ingredient;
import com.example.subway_sandwich.service.IngredientService;

import java.util.List;

@RestController
public class IngredientController {
    @Autowired
    private IngredientService ingredientService;

    @GetMapping("/ingredients")
    public List<Ingredient> getAllIngredients() {
        return ingredientService.getAllIngredients();
    }
}

