// An interface with exactly one abstract method.

// Marked with @FunctionalInterface.

@FunctionalInterface
interface Greeting {
    void sayHello(String name);
}

public class FunctionalInterfaceDemo {

    public static void main(String[] args) {

        Greeting g = (name) -> System.out.println("Hello, " + name);

        g.sayHello("Sagar");
    }

}
