package designPatterns.Singleton;

public class Main {

    public static void main(String args[]) {
        Singleton x = Singleton.getInstance();
        Singleton y = Singleton.getInstance();
        Singleton z = Singleton.getInstance();

        // changing variable of instance x
        x.greeting = (x.greeting).toUpperCase();

        // we instantiate the singleton class with 3 objects x, y, z by calling static method getInstance().
        // But actually after creation of object x, variables y and z are pointed to object x.
        System.out.println("String from x is " + x.greeting);
        System.out.println("String from y is " + y.greeting);
        System.out.println("String from z is " + z.greeting);
        System.out.println("\n");

        // changing variable of instance z
        z.greeting = (z.greeting).toLowerCase();

        System.out.println("String from x is " + x.greeting);
        System.out.println("String from y is " + y.greeting);
        System.out.println("String from z is " + z.greeting);


        System.out.println("\n");
        System.out.println("Singleton Enum");

        SingletonEnum singletonX = SingletonEnum.INSTANCE;
        SingletonEnum singletonY = SingletonEnum.INSTANCE;
        System.out.println(singletonX.getValue());
        System.out.println(singletonY.getValue());
        singletonX.setValue(2);
        System.out.println(singletonX.getValue());
        System.out.println(singletonY.getValue());

    }
}
