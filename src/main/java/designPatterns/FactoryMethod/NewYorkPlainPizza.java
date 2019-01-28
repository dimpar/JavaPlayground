package designPatterns.FactoryMethod;

//Concrete product
public class NewYorkPlainPizza implements Pizza {

    @Override
    public String getDescription() {
        return "This is a New York Plain style pizza";
    }

    @Override
    public int getPrice() {
        return 14;
    }
}
