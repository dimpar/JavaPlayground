package designPatterns.Strategy;

public class Main {
    public static void main(String args[]) {
       Animal sparky = new Dog();
       Animal tweety = new Bird();

       System.out.println(sparky.tryToFly());
       System.out.println(tweety.tryToFly());

       //BOOM! Can set an algorithm dynamically.
       tweety.setFlyingAbility(new ItCantFly());
       System.out.println(tweety.tryToFly());
    }
}
