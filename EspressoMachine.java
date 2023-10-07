package myCoffeeProject;

class EspressoMachine implements CoffeeBrewer {
    @Override
    public void brewCoffee() {
        System.out.println("Brewing espresso...");
    }
}
