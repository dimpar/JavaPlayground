package designPatterns.FactoryMethod;

//Concrete product
public class ChicagoPepperoniPizza implements Pizza {
    @Override
    public String getDescription() {
        return "This is a Chicago Pepperoni style pizza";
    }

    @Override
    public int getPrice() {
        return 12;
    }
}
