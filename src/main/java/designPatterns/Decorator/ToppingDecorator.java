package designPatterns.Decorator;

abstract class ToppingDecorator implements Pizza {
    protected Pizza tempPizza;

    public ToppingDecorator(Pizza tempPizza) {
        this.tempPizza = tempPizza;
    }

    public String getDescription() {
        return tempPizza.getDescription();
    }

    public double getCost() {
        return tempPizza.getCost();
    }
}
