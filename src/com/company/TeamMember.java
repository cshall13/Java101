package com.company;

public class TeamMember{
    public static String commonAttr = "Bootcamp graduates.";
    public static String teamName = "It's all peachy";
    private String name;
    private String favoriteLanguage;
    private String favoriteFood;
    private String favoriteColor;
    private String favoriteTeam;
    private Pet pets;

    public TeamMember(String name, String favoriteLanguage, String favoriteFood, String favoriteColor, String favoriteTeam) {
        this.name = name;
        this.favoriteLanguage = favoriteLanguage;
        this.favoriteFood = favoriteFood;
        this.favoriteColor = favoriteColor;
        this.favoriteTeam = favoriteTeam;
    }

    public TeamMember(String name, String favoriteLanguage, String favoriteFood, String favoriteColor, String favoriteTeam, Pet pets) {
        this.name = name;
        this.favoriteLanguage = favoriteLanguage;
        this.favoriteFood = favoriteFood;
        this.favoriteColor = favoriteColor;
        this.favoriteTeam = favoriteTeam;
        this.pets = pets;
    }

    public String getName() {
        return name;
    }

    public String getFavoriteFood() {
        return favoriteFood;
    }

    public void setFavoriteFood(String favoriteFood) {
        this.favoriteFood = favoriteFood;
    }

    public String getFavoriteColor() {
        return favoriteColor;
    }

    public void setFavoriteColor(String favoriteColor) {
        this.favoriteColor = favoriteColor;
    }

    public String getFavoriteTeam() {
        return favoriteTeam;
    }

    public void setFavoriteTeam(String favoriteTeam) {
        this.favoriteTeam = favoriteTeam;
    }

    public Pet getPets() {
        return pets;
    }

    public void setPets(Pet pets) {
        this.pets = pets;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFavoriteLanguage() {
        return favoriteLanguage;
    }

    public void setFavoriteLanguage(String favoriteLanguage) {
        this.favoriteLanguage = favoriteLanguage;
    }
}