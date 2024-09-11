package com.example.thymeleafcocktailsopgave.Repository;

import com.example.thymeleafcocktailsopgave.Cocktail.Cocktail;
import com.example.thymeleafcocktailsopgave.Cocktail.Ingredient;
import org.springframework.stereotype.Repository;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class CocktailRepository {

    private final List<Cocktail> cocktails = new ArrayList<>();

    public CocktailRepository() {
        populateCocktails();
    }

    public void populateCocktails(){

        cocktails.add(new Cocktail("Trylledrik", Arrays.asList(new Ingredient("Vand"),new Ingredient("Vodka"))));
        cocktails.add(new Cocktail("Bloody Mary", Arrays.asList(new Ingredient("Tequila"),new Ingredient("Tomatjuice"))));
        cocktails.add(new Cocktail("Rom og Cola", Arrays.asList(new Ingredient("Rom"),new Ingredient("Cola"))));
        cocktails.add(new Cocktail("Tequila Sunrise",Arrays.asList(new Ingredient("Tequila"),new Ingredient("Appelsinjuice"))));
    }


    public List<Cocktail> getAllCocktails() {
        return cocktails;
    }


    //GETMAPPING-ATTRACTION{NAME}
    public Cocktail findCocktailByName(String name) {
        Cocktail cocktailMatch = null;
        for (Cocktail cocktail : getAllCocktails()) {
            if (name.equals(cocktail.getName())) {
                cocktailMatch = cocktail;
            }
        }
        return cocktailMatch;
    }
}
