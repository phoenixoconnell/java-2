# java-2
**OOP Java Module @TEKcamp**

There are 3 exercises to complete for the OOP-Java module.

Exercise 1 is based off Section 7 of the UDEMY course - [Java Masterclass](https://teksystemsbootcamp.udemy.com/course/java-the-complete-java-developer-course/learn/lecture/3404262#overview), by Tim Buchalka

For your reference, if you wanted to see the <em>original</em> instructions verbatim from the Java Masterclass, find them in the file <code>OOP-master-challenge-exercise-udemy.txt</code> file.

The bonus assignment for these exercises is simply to fully complete all of the requirements of every exercise.  If they are all completed, you will be awarded with a 3 😄



## ********************************************************
## Exercise 1 : 
- The purpose of the application is to help a fictitious company called Bills Burgers to manage their process of selling hamburgers. This application will help Bill to select types of burgers, some of the additional items (additions) to be added to the burgers and pricing.
- Your application should consist of the following Java Classes:
  
- <h3>Plain Hamburger Class</h3>
  
  * Bread roll type
  * Meat (beef, chicken, steak,etc.)
  * Toppings (lettuce,tomatoes,carrots,mustard,ketchup,relish,guacamole,cheese, mayonaise, etc.) //with associated prices for each additional topping.
  * A max amount of 2 toppings allowed for a Plain Hamburger
  * Plain Hamburger price
  * totalBurgerPrice() //after adding all additional topppings
  * plainBurgerPrice() //Show the cost of a plain hamburger without any additional toppings

- <h3>Healthy Burger Class</h3>
  
  - should inherit from the Plain Hamburger Class
  - should allow for a max of 4 toppings
  - should only allow "healthy" topping choices (no bacon, no cheese, etc.)

- <h3>Deluxe Burger Class</h3>
  - should inherit from the Basic Hamburger Class
  - should allow for a max of 6 additional toppings

- <h3>Bread Class</h3>
  - should <strong><code>not</code></strong> inherit from the Burger Class
- <h3>Meat Class</h3>
  - should <strong><code>not</code></strong> inherit from the Burger Class
- <h3>Side Class</h3>
  - should <strong><code>not</code></strong> inherit from the Burger Class
  
## ********************************************************
## Exercise 2 : 

Create two new Class types, 

  - <code>Meal Class</code>
  - <code>Order Class</code>

- <h3>Meal Class</h3>
  
  - <code>"Has a"</code> specific Burger from the 3 burger classes created in Exercise 1.  
  - <code>"Has a"</code> Drink (water, gatorade, power aid, coke, mountain dew, sprite, fanta, dr. pepper, diet coke, etc.)
  - <code>"Has a"</code> Side (fries, chips, apple pie, ice cream, etc.)
  -  //HINT: Research what a <code>has a</code> relationship in OOP refers to.

  - By default, a meal comes with a plain burger, fries, and a drink
 

- <h3>Order Class</h3>
  
  - This is the primary class that will be utilized by other parts of the code.  All the other classes are <code>encapsulated</code> by the Order class.   
  - The 1st Order constructor function should accept the following parameters: 
    - Burger, Bread, Meat
  - The 2nd Order constructor function should accept the following single parameter:
    - Meal
  - addToppings() //method that accepts a variable number of Toppings as arguments.
  - addSides() //method that accepts a variable number of Sides as arguments.
  - addBurger() //method that adds a specific Burger type to the order.
  - purchaseOrder() //Allows the customer to make the purchase.

  - To help you visualize how some code might look for the order class, take a look at the following code snippet: 
  
   <code>

     - Order order = New Order(Burger.plain, Bread.rye, Meat.roastBeef);
     - order.addToppings(Topping.ketchup, Topping.mustard, Topping.pickles, Topping.onions);
     - order.addDrink(Drink.dietCoke);
     - order.addSides(Side.chips, Side.fries);
     - Order order2 = new Order(Combo.healthy);
     - order2.addDrink(Drink.dietCoke);
   </code>

 - Note that the above code snippet is provided to give you an idea of how the Order class could be instantiated and utilized.  This is <strong>NOT</strong> the <strong>ONLY</strong> way to do it, but simply an idea for inspiration.

  
## ********************************************************
## Exercise 3 : 

  Building on Bills Burger Shop, add the following features to your code:

  - Prevent the Meal Class from allowing multiples of the SAME item from being added to it.  
  - Prevent the Meal Class from allowing multiple Burgers
  - Prevent the Meal Class from allowing multiple Drinks
  - Limit the Meal Class to a maximum of 3 sides
  - When adding toppings, only accept valid toppings
  - When adding drinks, only accept valid drinks
  - When adding breads, only accept valid bread types
  - When adding meats, only accept valid meats.
  - There should be limits for Toppings (ex: pickles x1 or extra pickles x2 allowed, but not pickles x3, pickles x4, etc.)

  - Prevent the bread, meat, side, topping and meal classes from being instantiated or modified in the Main.main() method.  The only class that should be instantiated is the order class.
  - Prevent the properties in all of the classes from being modified directly  Use the concepts of encapsulation to accomplish this task.  
  - Add any additional exception handling, where you feel it is appropriate.

## ********************************************************
## Git Instructions
- [ ] Create a template copy of this repository by clicking : "Use this template"
- [ ] Name the repository the same name as the master template repository.  
- [ ] Add your TA as collaborator
- [ ] Clone YOUR repo to your local computer
- [ ] Create a new branch: <code>git checkout -b `<firstName-lastName>`</code>.
- [ ] Implement the project on your newly created `<firstName-lastName>` branch, committing changes regularly.
- [ ] Push all of your commits: <code>git push origin `<firstName-lastName>`</code>.
- [ ] When ready for your TA to review, open a Pull Request (PR) and add your TA as a collaborator.
  
## ********************************
## TEKsystems Academy Submission Instructions
- [ ] After Submitting a Pull Request to your TA, Submit the exercise in [TEKacademy](https://bit.ly/TEKacademy)  Upload the form using the  <code>Upload your Assignment</code> button in the Corresponding module of [TEKacademy](https://bit.ly/TEKacademy)
- [ ] Download & Complete the [Exercise Evaluation Form](https://teksystems.tahoe.appsembler.com/assets/courseware/v1/5cde54cebe581062f1328323e651268d/asset-v1:teksystems+TEK_edX_FSBootcamp+2020+type@asset+block/Exercise_Evaluation_form.docx).  Upload the form in [TEKacademy](https://bit.ly/TEKacademy)