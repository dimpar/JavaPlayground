package designPatterns.FactoryMethod;

//Concrete product
public class NewYorkCheesePizza implements Pizza {
    @Override
    public String getDescription() {
        return "This is a New York Cheese style pizza";
    }

    @Override
    public int getPrice() {
        return 16;
    }
}
