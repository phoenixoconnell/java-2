package burger_shop;

import java.util.ArrayList;

public class DeluxeBurger extends Burger {

    DeluxeBurger() {
        super();
        this.maxToppings = 6;
    }

    DeluxeBurger(String bread, String protein, ArrayList<Toppings> toppings) {
        super(bread, protein, toppings);
        this.maxToppings = 6;
    }


}
