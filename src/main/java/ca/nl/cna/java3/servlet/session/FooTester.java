package ca.nl.cna.java3.servlet.session;

/**
 * This class is a simple POJO that represents a Foo object which is just and id and a value for demonstration
 */
public class FooTester {

    public static void main(String[] args) {
        Foo foo = new Foo(1, "bar");
        System.out.println(foo.toString());
    }

}
