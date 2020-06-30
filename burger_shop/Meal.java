package burger_shop;

import java.util.ArrayList;

public class Meal {

    protected enum Drink {
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

    protected Drink drink;
    protected Burger burger;
    protected ArrayList<String> sides;

    Meal() {
        this.drink = Drink.COKE;
        this.burger = new Burger();
        this.sides = new ArrayList<>();
    }

    Meal(Drink drink, Burger burger, String side) {
        this.drink = drink;
        this.burger = burger;
        this.sides = new ArrayList<>();

        this.sides.add(side);
    }

    public Burger getBurger() {
        return this.burger;
    }

    public void setBurger(Burger burger) {
        this.burger = burger;
    }

    public void addSide(String side) {
        this.sides.add(side);
    }
}
