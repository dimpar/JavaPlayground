package designPatterns.Singleton;

//Singleton with public static factory method.
public class Singleton {

    private static Singleton singletonInstance = null;

    public String greeting;

    // Using private constructor we can ensure that no more than one object can be created at a time.
    private Singleton() {
        greeting = "Hello I am a Singleton Class";
    }

    public static Singleton getInstance() {
        if (singletonInstance == null) {
            singletonInstance = new Singleton();
        }

        return singletonInstance;
    }

//    Synchronization is used to ensure that no more than one object is created with multiple concurrent threads
//    public static Singleton getInstance() {
//        synchronized (Singleton.class) {
//            if (singletonInstance == null) {
//                singletonInstance = new Singleton();
//            }
//        }
//
//        return singletonInstance;
//    }
}
