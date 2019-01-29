package designPatterns.Strategy;

public class ItCantFly implements Flys {
    @Override
    public String fly() {
        return "Can't fly";
    }
}
