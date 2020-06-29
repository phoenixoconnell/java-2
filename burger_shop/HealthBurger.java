package burger_shop;

import java.util.ArrayList;

public class HealthBurger extends Burger {
    
    HealthBurger() {
        super();
        this.maxToppings = 4;
    }
    
    HealthBurger(String protein, ArrayList<Toppings> toppings) {
        super(protein, toppings);
        this.maxToppings = 4;
        this.toppings.removeIf(t -> !t.isHealthy());
    }
    
    @Override
    public void addTopping(Toppings topping) {
        if(topping.isHealthy()) {
            super.addTopping(topping);
        } else System.out.println("Topping is unhealthy!");
    }
}
