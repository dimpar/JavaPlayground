package designPatterns.FactoryMethod;

//Concrete product
public class ChicagoPlainPizza implements Pizza {
    @Override
    public String getDescription() {
        return "This is a Chicago Plain style pizza";
    }

    @Override
    public int getPrice() {
        return 10;
    }
}
