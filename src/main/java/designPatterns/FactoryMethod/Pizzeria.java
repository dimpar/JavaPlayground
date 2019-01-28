package designPatterns.FactoryMethod;

// Creator interface
public interface Pizzeria {

    public Pizza createPizza(PizzaStyle type); // factory method
}
