package burger_shop;

import java.util.Arrays;

public class Meal {
    
    private enum Drink {
        COKE("Coke"), DIET_COKE("Diet Coke"), DR_PEPPER("Dr Pepper"),
        SPRITE("Sprite"), TEA("Iced Tea"), LEMONADE("Lemonade"), WATER("Water");
        private String name;
        Drink(String name) {
            this.name = name;
        }
        public String getName() {
            return this.name;
        }
    }
    
    private Drink drink;
    private Burger burger;
    private String side;
    
    Meal() {
        this.drink = Drink.COKE;
        this.burger = new Burger();
        this.side = Side.FRIES;
    }
    
    Meal(Drink drink, Burger burger, String side) {
        this.drink = drink;
        this.burger = burger;
        this.side = side;
    }
}
