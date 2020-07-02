package burger_shop;

import java.util.Scanner;

public class Main {
    Scanner sc = new Scanner(System.in);
    Order order = Order.empty();
    boolean leaveMenu = false;

    public static void main(String[] args) {
        Main main = new Main();

        while(!main.leaveMenu) {
            main.mainMenu();
        }

    }

    public void mainMenu() {
        String[] items = {
                "Welcome to Bill's Burgers!",
                "Please make some selections to complete your order!",
                "(Use the first word of each menu option to make your selection)",
                "(The default meal selection is a plain burger, Coke, and fries)",
                "Burger selection",
                "Side selection",
                "Drink selection",
                "Checkout",
                "Exit"
        };

        prompt(items);

        switch(getSelection()) {
            case "Burger":
                burgerMenu();
                break;
            case "Side":
                sideMenu();
                break;
            case "Drink":
                drinkMenu();
                break;
            case "Checkout":
                checkout();
                break;
            case "Exit":
                leaveMenu = true;
                break;
            default:
                System.out.println("Invalid selection");
                break;
        }
    }

    public void burgerMenu() {
        boolean inMenu = true;

        String[] items = {
                "Burger menu",
                "Please make a selection using the first word of the items below:",
                "Burger option",
                "Bread option",
                "Meat option",
                "Toppings",
                "Back"
        };

        while(inMenu) {
            prompt(items);

            switch(getSelection()) {
                case "Burger":
                    burgerSelection();
                    break;
                case "Bread":
                    breadSelection();
                    break;
                case "Meat":
                    meatSelection();
                    break;
                case "Toppings":
                    toppingsSelection();
                    break;
                case "Back":
                    return;
                default:
                    System.out.println("Invalid selection");
                    break;
            }
        }
    }

    public void sideMenu() {
        boolean inMenu = true;

        String[] items = {
                "Side selection menu",
                "Please make a selection using the first word of the items below:",
                "French fries",
                "Sweet potato fries",
                "Mixed veggies",
                "Potato chips",
                "Mac and cheese",
                "Back"
        };

        while(inMenu) {
            prompt(items);

            switch(getSelection()) {
                case "Fries":
                    order.getMeal().addSide(Side.FRIES);
                    break;
                case "Sweet":
                    order.getMeal().addSide(Side.SP_FRIES);
                    break;
                case "Mixed":
                    order.getMeal().addSide(Side.MIXED_VEG);
                    break;
                case "Potato":
                    order.getMeal().addSide(Side.CHIPS);
                    break;
                case "Mac":
                    order.getMeal().addSide(Side.M_AND_C);
                    break;
                case "Back":
                    return;
                default:
                    System.out.println("Invalid selection");
                    break;
            }
        }
    }

    public void drinkMenu() {
        boolean inMenu = true;

        String[] items = {
                "Drink selection menu",
                "Please a selection using the first word of the items below:",
                "Coke",
                "Diet Coke",
                "Dr Pepper",
                "Sprite",
                "Iced tea",
                "Lemonade",
                "Water",
                "Back"
        };

        while(inMenu) {
            prompt(items);

            switch(getSelection()) {
                case "Coke":
                    order.getMeal().setDrink(Meal.Drink.COKE);
                    break;
                case "Diet Coke":
                    order.getMeal().setDrink(Meal.Drink.DIET_COKE);
                    break;
                case "Dr Pepper":
                    order.getMeal().setDrink(Meal.Drink.DR_PEPPER);
                    break;
                case "Sprite":
                    order.getMeal().setDrink(Meal.Drink.SPRITE);
                    break;
                case "Iced Tea":
                    order.getMeal().setDrink(Meal.Drink.TEA);
                    break;
                case "Lemonade":
                    order.getMeal().setDrink(Meal.Drink.LEMONADE);
                    break;
                case "Water":
                    order.getMeal().setDrink(Meal.Drink.WATER);
                    break;
                case "Back":
                    return;
                default:
                    System.out.println("Invalid selection");
            }
        }
    }

    public void checkout() {
        boolean inMenu = true;
        String[] items = {
                "You are about to purchase the following",
                "Burger: " + this.order.getMeal().getBurger().protein + " burger on ", this.order.getMeal().getBurger().getBread() + " bread with " + this.order.getMeal().getBurger().getToppings().size() + " toppings",
                "Side(s): " + this.order.getMeal().getSidesString(),
                "Drink: " + this.order.getMeal().getDrinkString(),
                "Please select one of the options below:",
                "Purchase order",
                "Start over",
                "Back"
        };

        while(inMenu) {
            prompt(items);

            switch(getSelection()) {
                case "Purchase":
                    order.purchaseOrder();
                    leaveMenu = true;
                    return;
                case "Start":
                    this.order = Order.empty();
                    return;
                case "Back":
                    return;
                default:
                    System.out.println("Invalid selection");
                    break;
            }
        }


    }

    public void burgerSelection() {
        boolean inMenu = true;

        String[] items = {
                "Burger selection menu",
                "Please make a selection using the first word of the items below:",
                "Plain burger",
                "Healthy burger",
                "Deluxe burger",
                "Back"
        };

        while(inMenu) {
            prompt(items);

            switch(getSelection()) {
                case "Plain":
                    this.order.getMeal().setBurger(Order.Hamburger.PLAIN.getBurger());
                    break;
                case "Healthy":
                    this.order.getMeal().setBurger(Order.Hamburger.HEALTHY.getBurger());
                    break;
                case "Deluxe":
                    this.order.getMeal().setBurger(Order.Hamburger.DELUXE.getBurger());
                    break;
                case "Back":
                    return;
                default:
                    System.out.println("Invalid selection");
                    break;
            }
        }
    }

    public void breadSelection() {
        boolean inMenu = true;

        String[] items = {
                "Bread selection menu",
                "Please make a selection using the first word of the items below",
                "Rye",
                "Brioche",
                "Sesame seed",
                "Plain",
                "Wheat",
                "Back"
        };

        while(inMenu) {
            prompt(items);

            switch(getSelection()) {
                case "Rye":
                    order.getMeal().getBurger().setBread(Bread.RYE);
                    break;
                case "Brioche":
                    order.getMeal().getBurger().setBread(Bread.BRIOCHE);
                    break;
                case "Sesame":
                    order.getMeal().getBurger().setBread(Bread.SESAME);
                    break;
                case "Plain":
                    order.getMeal().getBurger().setBread(Bread.PLAIN);
                    break;
                case "Wheat":
                    order.getMeal().getBurger().setBread(Bread.WHEAT);
                    break;
                case "Back":
                    return;
                default:
                    System.out.println("Invalid selection");
                    break;
            }
        }
    }

    public void meatSelection() {
        boolean inMenu = true;

        String[] items = {
                "Meat selection menu",
                "Please make a selection using the first word of the items below",
                "Beef",
                "Chicken",
                "Turkey",
                "Pork",
                "Soy",
                "Back"
        };

        while(inMenu) {
            prompt(items);

            switch(getSelection()) {
                case "Beef":
                    order.getMeal().getBurger().setMeat(Meat.BEEF);
                    break;
                case "Chicken":
                    order.getMeal().getBurger().setMeat(Meat.CHICKEN);
                    break;
                case "Turkey":
                    order.getMeal().getBurger().setMeat(Meat.TURKEY);
                    break;
                case "Pork":
                    order.getMeal().getBurger().setMeat(Meat.PORK);
                    break;
                case "Soy":
                    order.getMeal().getBurger().setMeat(Meat.SOY);
                    break;
                case "Back":
                    return;
                default:
                    System.out.println("Invalid selection");
                    break;
            }
        }
    }

    public void toppingsSelection() {
        boolean inMenu = true;

        String[] items = {
                "Toppings selection menu",
                "Please make a selection using the first word of the items below",
                "Lettuce",
                "Tomato",
                "Onion",
                "Relish",
                "Mustard",
                "Mayo",
                "Ketchup",
                "Bacon",
                "Cheese",
                "Guac",
                "Back"
        };

        while(inMenu) {
            prompt(items);

            switch(getSelection()) {
                case "Lettuce":
                    order.getMeal().getBurger().addTopping(Burger.Toppings.LETTUCE);
                    break;
                case "Tomato":
                    order.getMeal().getBurger().addTopping(Burger.Toppings.TOMATO);
                    break;
                case "Onion":
                    order.getMeal().getBurger().addTopping(Burger.Toppings.ONION);
                    break;
                case "Relish":
                    order.getMeal().getBurger().addTopping(Burger.Toppings.RELISH);
                    break;
                case "Mustard":
                    order.getMeal().getBurger().addTopping(Burger.Toppings.MUSTARD);
                    break;
                case "Mayo":
                    order.getMeal().getBurger().addTopping(Burger.Toppings.MAYO);
                    break;
                case "Ketchup":
                    order.getMeal().getBurger().addTopping(Burger.Toppings.KETCHUP);
                    break;
                case "Bacon":
                    order.getMeal().getBurger().addTopping(Burger.Toppings.BACON);
                    break;
                case "Cheese":
                    order.getMeal().getBurger().addTopping(Burger.Toppings.CHEESE);
                    break;
                case "Guac":
                    order.getMeal().getBurger().addTopping(Burger.Toppings.GUAC);
                    break;
                case "Back":
                    return;
                default:
                    System.out.println("Invalid selection");
                    break;
            }
        }
    }

    public String getSelection() {
        return sc.nextLine();
    }

    public void prompt(String line) {
        System.out.println(line);
    }

    public void prompt(String[] lines) {
        for(String line: lines) {
            prompt(line);
        }
    }
}