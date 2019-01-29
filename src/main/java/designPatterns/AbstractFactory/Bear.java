package designPatterns.AbstractFactory;

public class Bear implements Animal {

    @Override
    public String getAnimal() {
        return "Bear";
    }

    @Override
    public String makeSound() {
        return "Waargh";
    }
}
