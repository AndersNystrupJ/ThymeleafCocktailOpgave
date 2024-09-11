package com.example.thymeleafcocktailsopgave.Cocktail;

import java.util.ArrayList;
import java.util.List;

public class Cocktail {
    private String name;
    private List<Ingredient> ingredient = new ArrayList<>();

    public Cocktail(String name, List<Ingredient> ingredient){
        this.name = name;
        this.ingredient = ingredient;
    }

    public String getName() {
        return name;
    }

    public List<Ingredient> getIngredient() {
        return ingredient;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return name;
    }


}
