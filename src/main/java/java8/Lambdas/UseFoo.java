package java8.Lambdas;

public class UseFoo {

    public String addFoo(String string, Foo foo) {
        return foo.myMethod(string);
    }
}
