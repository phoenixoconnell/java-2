package burger_shop;

import burger_shop.Burger.Toppings;

public class Order {
    private Meal meal;

    protected enum Hamburger {
        PLAIN(new Burger()), HEALTHY(new HealthBurger()), DELUXE(new DeluxeBurger());

        private Burger burger;

        Hamburger(Burger burger) {
            this.burger = burger;
        }

        public Burger getBurger() {
            return this.burger;
        }
    }

    Order(Meal meal) {
        this.meal = meal;
    }

    Order(Burger burger, String bread, String meat) {
        burger.setBread(bread);
        burger.setMeat(meat);
        this.meal = new Meal(Meal.Drink.COKE, burger, Side.FRIES);
    }

    public void addToppings(Toppings ...toppings) {
        for(Toppings topping: toppings) {
            this.meal.getBurger().addTopping(topping);
        }
    }

    public void addSides(String ...sides) {
        for(String side: sides) {
            this.meal.addSide(side);
        }
    }

    public void addBurger(String burger) {
        this.meal.setBurger(Hamburger.valueOf(burger).getBurger());
    }

    public void purchaseOrder() {
        this.meal.burger.calculateTotalPrice();
    }
}
