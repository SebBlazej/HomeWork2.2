import java.lang.reflect.Array;
import java.util.ListIterator;

public class Recipes {
    public static void main(String[] args){
        Ingredient whiteRum = new Ingredient();
        whiteRum.name = "White Rum";
        whiteRum.volume = 50;
        Ingredient coconutCream = new Ingredient();
        coconutCream.name = "Coconut Cream";
        coconutCream.volume = 25;
        Ingredient pineappleJuice = new Ingredient();
        pineappleJuice.name = "Pineapple Juice";
        pineappleJuice.volume = 100;

        Drink pinaColada = new Drink();
        pinaColada.name = "Pina Colada";
        pinaColada.ingredients[0] = whiteRum;
        pinaColada.ingredients[1] = coconutCream;
        pinaColada.ingredients[2] = pineappleJuice;
        pinaColada.price = 3.50F;
        pinaColada.alcoholicDrink = true;

        System.out.println(pinaColada.name);
        System.out.println("Ingredients:");
        for(int i = 0; i<3; i++) {
            System.out.println(pinaColada.ingredients[i].name + " - " + pinaColada.ingredients[i].volume + "ml");
        }
        System.out.println("Total drink volume - "
                + (pinaColada.ingredients[0].volume + pinaColada.ingredients[1].volume + pinaColada.ingredients[2].volume) +"ml");
        System.out.println("Price - " + pinaColada.price + "$");
        System.out.println("Alcoholic drink - " + ((pinaColada.alcoholicDrink == true)?"Yes":"No"));

    }
}
