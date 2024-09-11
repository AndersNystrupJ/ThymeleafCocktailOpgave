package com.example.thymeleafcocktailsopgave.Cocktail;

public enum CocktailType {
    BLOODY_MARY ("Bloody Mary"),
    TEQUILA_SUNRISE ("Tequla Sunrise"),
    ROM_OG_COLA ("Rom og Cola"),
    TRYLLEDRIK ("Trylledrik");

    private String displayName;

    CocktailType(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}
