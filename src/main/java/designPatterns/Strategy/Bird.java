package designPatterns.Strategy;

public class Bird extends Animal {
    public void digHole(){

        System.out.println("Tweet a bit");

    }

    public Bird(){

        super();

        // We set the Flys interface polymorphically
        // This sets the behavior as a flying Animal

        flyingType = new ItFlies();

    }
}
