package com.example.thymeleafcocktailsopgave.cocktailController;


import com.example.thymeleafcocktailsopgave.Cocktail.Cocktail;
import com.example.thymeleafcocktailsopgave.Cocktail.CocktailOrder;
import com.example.thymeleafcocktailsopgave.Cocktail.CocktailType;
import com.example.thymeleafcocktailsopgave.Cocktail.ShotAmount;
import com.example.thymeleafcocktailsopgave.Service.CocktailService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("")
public class cocktailController {

    private final CocktailService cocktailService;

    public cocktailController(CocktailService cocktailService) {
        this.cocktailService = cocktailService;
    }

    @GetMapping("/cocktail")
    public String viewRecipe(@RequestParam("name") String name, Model model) {
        Cocktail cocktail = cocktailService.findCocktailByName(name);
        model.addAttribute("cocktail",cocktail);
        return "detail";
    }

    @GetMapping("/cocktails")
    public String listCocktails(Model model) {
        List<Cocktail> cocktails = cocktailService.getAllCocktails();
        model.addAttribute("cocktails", cocktails);
        return "index";
    }

    @GetMapping("/order")
    public String showOrderForm(Model model) {
        CocktailOrder cocktailOrder = new CocktailOrder();
        cocktailOrder.setShotAmount(ShotAmount.ONE);
        model.addAttribute("cocktailOrder", cocktailOrder);
        model.addAttribute("cocktailType", CocktailType.values());
        model.addAttribute("withIce", cocktailOrder.isWithIce());
        model.addAttribute("shotAmount", ShotAmount.values());
        return "order-form";
    }





}
