package java8.Lambdas;

public class Main {
    public static void main(String[] args) {
        UseFoo useFoo = new UseFoo();

        Foo foo = parameter -> parameter + " from lambda";
        String actual = useFoo.addFoo("Honey", foo);

        System.out.println(actual);
    }
}
