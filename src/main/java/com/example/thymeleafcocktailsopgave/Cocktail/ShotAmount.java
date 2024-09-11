package com.example.thymeleafcocktailsopgave.Cocktail;

public enum ShotAmount {
    ONE ("1"),
    TWO ("2"),
    THREE ("3");

    private String displayName;

    ShotAmount(String displayName){
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}
