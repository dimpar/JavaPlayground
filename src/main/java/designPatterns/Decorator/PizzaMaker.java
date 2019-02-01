package designPatterns.Decorator;

public class PizzaMaker {
    // The PlainPizza object is sent to the Mozzarella constructor
    // and then to the TomatoSauce constructor

    public static void main(String[] args) {

        Pizza basicPizza = new TomatoSauce(new Mozzarella(new PlainPizza()));

        System.out.println("Ingredients: " + basicPizza.getDescription());

        System.out.println("Price: " + basicPizza.getCost());
    }
}
