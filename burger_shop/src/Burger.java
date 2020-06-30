package burger_shop;

import java.util.ArrayList;


public class Burger {
    
    protected enum Toppings {
        LETTUCE(0.25, true), KETCHUP(0.05, false), MUSTARD(0.05, true), MAYO(0.05, false),
        BACON(1.25, false), CHEESE(0.99, false), TOMATO(0.25, true), ONION(0.25, true),
        RELISH(0.05, true), GUAC(0.99, true);
        private final double price;
        private final boolean healthy;
        Toppings(double price, boolean healthy) {
            this.price = price;
            this.healthy = healthy;
        }
        public double getPrice() {
            return this.price;
        }
        public boolean isHealthy() {
            return this.healthy;
        }
    }
    
    protected int maxToppings;
    ArrayList<Toppings> toppings;
    private final double basePrice;
    protected double totalPrice;
    protected String protein;
    
    Burger() {
        this.maxToppings = 2;
        this.protein = Meat.BEEF;
        this.toppings = new ArrayList<>();
        this.basePrice = this.totalPrice = 2.99;
    }
    
    Burger(String protein, ArrayList<Toppings> toppings) {
        this.maxToppings = 2;
        this.protein = protein;
        this.toppings = toppings;
        this.basePrice = this.totalPrice = 2.99;
        //maps the topping list to double, then gets price of all toppings, adding it to the base price to get total price
        this.totalPrice += this.toppings.stream().mapToDouble(t -> t.getPrice()).reduce(0, (t, p) -> t + p);
    }
    
    public ArrayList<Toppings> getToppings() {
        return toppings;
    }
    
    public String getProtein() {
        return protein;
    }
    
    public void addTopping(Toppings topping) {
        if(this.toppings.size() < maxToppings) {
            this.toppings.add(topping);
        } else System.out.println("Toppings maxed out!");
    }
    
    public void removeTopping(Toppings topping) {
        this.toppings.remove(topping);
    }
    
    public double getToppingsPrice() {
        //map toppings to each individual price (double), then reduce to get total topping price
        return this.toppings.stream().mapToDouble(t -> t.getPrice()).reduce(0, (t, p) -> t + p);
    }
    
    public void calculateTotalPrice() {
        if(this.basePrice == this.totalPrice) {
            this.totalPrice += this.toppings.stream().mapToDouble(t -> t.getPrice()).reduce(0, (t, p) -> t + p);
        }
    }
    
    public double getTotalPrice() {
        return this.totalPrice;
    }
    
    public double getBasePrice() {
        return this.basePrice;
    }
}
