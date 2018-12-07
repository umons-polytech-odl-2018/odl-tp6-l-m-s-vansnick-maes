package Pizza_package;

import java.util.ArrayList;

public abstract class Pizza_composant implements Food {

    String name;
    ArrayList<Ingredient_Feuille> ingredients;
    float prix;
    //par défaut c'est privé

    public Pizza_composant (String name){
        this.name = name;

        ingredients = new ArrayList<>();

    }

    public void addIngredient(Ingredient_Feuille ingredient) {
        ingredients.add(ingredient);
    }

    @Override
    public String getName() {

        return name;
    }

    @Override
    public float getPrice() {
        return prix;
    }
}
