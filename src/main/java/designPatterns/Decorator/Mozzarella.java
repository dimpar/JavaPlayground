package designPatterns.Decorator;

public class Mozzarella extends ToppingDecorator {

    public Mozzarella(Pizza tempPizza) {
        super(tempPizza);

        System.out.println("Adding Dough");

        System.out.println("Adding Moz");
    }

    public String getDescription() {
        return tempPizza.getDescription() + ", Mozzarella";
    }

    public double getCost() {
        System.out.println("Cost of Sauce: " + .35);

        return tempPizza.getCost() + 0.5;
    }
}
