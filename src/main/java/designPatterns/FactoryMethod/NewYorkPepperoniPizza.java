package designPatterns.FactoryMethod;

//Concrete product
public class NewYorkPepperoniPizza implements Pizza {
    @Override
    public String getDescription() {
        return "This is a New York Pepperoni style pizza";
    }

    @Override
    public int getPrice() {
        return 17;
    }
}
