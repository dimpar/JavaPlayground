package designPatterns.FactoryMethod;

//Concrete creator
public class ChicagoPizzeria implements Pizzeria {

    @Override
    public Pizza createPizza(PizzaStyle type) {
        if (type == PizzaStyle.CHEESE) {
            return new ChicagoCheesePizza();
        } else if (type == PizzaStyle.PEPPERONI) {
            return new ChicagoPepperoniPizza();
        }

        return new ChicagoPlainPizza();
    }
}
