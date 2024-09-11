package com.example.thymeleafcocktailsopgave.Cocktail;

public class CocktailOrder {

    private CocktailType cocktailType;
    private boolean withIce;
    private ShotAmount shotAmount;

    public CocktailOrder(){}


    public CocktailType getCocktailType() {
        return cocktailType;
    }

    public boolean isWithIce() {
        return withIce;
    }

    public ShotAmount getShotAmount() {
        return shotAmount;
    }

    public void setCocktailType(CocktailType cocktailType) {
        this.cocktailType = cocktailType;
    }

    public void setWithIce(boolean withIce) {
        this.withIce = withIce;
    }

    public void setShotAmount(ShotAmount shotAmount) {
        this.shotAmount = shotAmount;
    }
}
