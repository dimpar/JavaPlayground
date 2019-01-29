package designPatterns.AbstractFactory;

public interface AbstractFactory<T> {
    T create(String type);
}
