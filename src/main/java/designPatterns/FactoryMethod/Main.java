package designPatterns.FactoryMethod;

public class Main {

    public static void main(String[] args) {
        Pizzeria NYPizzeria = new NYPizzeria();

        Pizza NYCheesePizza = NYPizzeria.createPizza(PizzaStyle.CHEESE);
        System.out.println(NYCheesePizza.getDescription());

        Pizza NYPepperoniPizza = NYPizzeria.createPizza(PizzaStyle.PEPPERONI);
        System.out.println(NYPepperoniPizza.getDescription());

        //------------

        Pizzeria ChicagoPizzeria = new ChicagoPizzeria();

        Pizza ChicagoCheesePizza = ChicagoPizzeria.createPizza(PizzaStyle.CHEESE);
        System.out.println(ChicagoCheesePizza.getDescription());

        Pizza ChicagoPizza = ChicagoPizzeria.createPizza(null);
        System.out.println((ChicagoPizza.getDescription()));
    }
}
