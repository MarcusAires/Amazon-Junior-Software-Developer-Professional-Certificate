public class Coffee {

    // Attributes to store information about the coffee
    String name;                // for example, "Espresso", "Latte", "Mocha"
    String roast;               // for example, "light", "medium", "dark"
    int caffeineLevelInMg;      // calculated based on the roast
    double price;               // in dollars, for example, 2.50

    // Constructor to create a new coffee object with the given information
    public Coffee(String name, String roast, double price, int numberOfShots) {
        this.name = name;
        this.roast = roast;
        this.price = price;

        // The constructor calls the method to set the caffeine level based on the roast
        setCaffeineLevel();
    }
    // TODO 2: inherit from Coffee using the extends keyword
    public class Espresso extends Coffee{
        // TODO 3: declare an attribute to store the number of shots (int)
        int numberOfShots;
        // TODO 4: constructor to initialize all attributes
        public Espresso(String name, String roast, double price, int numberOfShots) {
            // TODO 5: use super to call the Coffee constructor
            super(name,roast,price,numberOfShots);
            // TODO 6: initialize numberOfShots using this
            this.numberOfShots = numberOfShots;
        }

        // TODO 7: define a method to print a message about the number of servings, cost per serving, and total bill
        public void printEspressoDetails(){
            System.out.println("you Asked for: " + numberOfShots + "Every Serving of "+ name +" costs "+price+". Your total bill is "+numberOfShots*price);
        }
    }

    // Method to set the caffeine level of the coffee based on the roast
    public void setCaffeineLevel() {
        if (roast.equals("light")) {
            caffeineLevelInMg = 50;
        } else if (roast.equals("medium")) {
            caffeineLevelInMg = 100;
        } else if (roast.equals("dark")) {
            caffeineLevelInMg = 150;
        } else {
            caffeineLevelInMg = 0;
        }
    }

    // Methods to simulate coffee preparation
    public void grindBeans() {
        System.out.println("\nGrinding beans for " + name + "...");
    }

    public void brewCoffee() {
        System.out.println("\nBrewing your favorite " + name + "...");
    }

    // Method to print the information about the coffee
    public void printInfo() {
        System.out.println("\nYou ordered a " + name + " with a " + roast + " roast.");
        System.out.println("The caffeine level in your coffee is " + caffeineLevelInMg + " mg.");
    }
}
