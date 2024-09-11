package com.example.thymeleafcocktailsopgave.Cocktail;

public class Ingredient {

    private String name;

    public Ingredient(String name) {
        this.name = name;
    }
    public String getName(){
        return name;
    }


    public String toString() {
        return name;
    }
}
