package com.example.thymeleafcocktailsopgave.Service;

import com.example.thymeleafcocktailsopgave.Cocktail.Cocktail;
import com.example.thymeleafcocktailsopgave.Cocktail.CocktailOrder;
import com.example.thymeleafcocktailsopgave.Repository.CocktailRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CocktailService {

    private final CocktailRepository cocktailRepository;

    public CocktailService(CocktailRepository cocktailRepository) {
        this.cocktailRepository = cocktailRepository;
    }

    public List<Cocktail> getAllCocktails() {
        return cocktailRepository.getAllCocktails();
    }
    //GETMAPPING-ATTRACTION{NAME}
    public Cocktail findCocktailByName(String name) {
        return cocktailRepository.findCocktailByName(name);
    }

    public List<CocktailOrder> getAllCocktailOrders() {
        return cocktailRepository.getAllCocktailOrders();
    }



}
