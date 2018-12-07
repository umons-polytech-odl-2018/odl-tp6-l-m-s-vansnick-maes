package Pizza_package;

import Pizza_package.Food;

public abstract class Ingredient_Feuille implements Food {

    private String ingredient;
    private double prix;


    public Ingredient_Feuille(String nom, double prix){

        this.ingredient = nom;
        this.prix = prix;

    }

    @Override
    public float getPrice() {
        return 0;
    }

    @Override
    public String getName() {
        return null;
    }


}
