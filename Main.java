package myCoffeeProject;

public class Main {
    public static void main(String[] args) {
        // Using SRP, OCP, LSP, ISP, and DIP
        CoffeeBrewer espressoMachine = new EspressoMachine();
        CoffeeBrewer dripCoffeeMaker = new DripCoffeeMaker();
        MilkFrother milkFrother = new MilkFrothingMachine();

        CoffeeMachineUser user1 = new CoffeeMachineUser(espressoMachine, milkFrother);
        user1.makeCoffee();

        CoffeeMachineUser user2 = new CoffeeMachineUser(dripCoffeeMaker, null);
        user2.makeCoffee();
    }
}
