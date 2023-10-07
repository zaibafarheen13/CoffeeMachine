package myCoffeeProject;

// Dependency Inversion Principle (DIP)
class CoffeeMachineUser {
    private final CoffeeBrewer coffeeBrewer;
    private final MilkFrother milkFrother;

    // Constructor that accepts CoffeeBrewer and MilkFrother
    public CoffeeMachineUser(CoffeeBrewer coffeeBrewer, MilkFrother milkFrother) {
        this.coffeeBrewer = coffeeBrewer;
        this.milkFrother = milkFrother;
    }

    public void makeCoffee() {
        coffeeBrewer.brewCoffee();
        if (milkFrother != null) {
            milkFrother.frothMilk();
        }
    }
}
