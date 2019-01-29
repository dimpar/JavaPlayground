package designPatterns.AbstractFactory;

public class Main {
    public static void main(String[] args) {
        AbstractFactory<Animal> animalFactory = FactoryProvider.getFactory("Animal");

        Animal dog = animalFactory.create("Dog");
        Animal duck = animalFactory.create("Duck");

        System.out.println(dog.makeSound());
        System.out.println(duck.makeSound());

        ///////

        AbstractFactory<Color> colorFactory = FactoryProvider.getFactory("Color");
        Color white = colorFactory.create("white");
        System.out.println(white.getColor());


    }
}
