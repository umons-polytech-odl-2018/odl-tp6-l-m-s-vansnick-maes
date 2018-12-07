package Pizza_package.Nom_de_pizza;
import Pizza_package.Pizza_composant;
import Pizza_package.ingrédients.fromage;
import Pizza_package.ingrédients.pate;
import Pizza_package.ingrédients.sauce_tomate;


public class Margherita extends Pizza_composant {

    public Margherita(){
        super("Margheritta");
        addIngredient(new pate()); //rajoute chaque classe d'ingrédient nécessaire
        addIngredient(new fromage());
        addIngredient(new sauce_tomate());
    }
}
