package designPatterns.FactoryMethod;

//Concrete creator
public class NYPizzeria implements Pizzeria {

    @Override
    public Pizza createPizza(PizzaStyle type) {
        if (type == PizzaStyle.CHEESE) {
            return new NewYorkCheesePizza();
        } else if (type == PizzaStyle.PEPPERONI) {
            return new NewYorkPepperoniPizza();
        }

        return new NewYorkPlainPizza();
    }
}
