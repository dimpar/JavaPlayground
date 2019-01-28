package designPatterns.FactoryMethod;

//Concrete product
public class ChicagoCheesePizza implements Pizza {
    @Override
    public String getDescription() {
        return "This is a Chicago Cheese style pizza";
    }

    @Override
    public int getPrice() {
        return 13;
    }
}
