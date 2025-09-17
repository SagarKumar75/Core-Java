abstract class Animal {
    abstract void sound(); // abstract method ( no body)

    void sleep() {
        System.out.println("This animal sleeps...");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks...");
    }
}

public class AbstractionDemo {

    public static void main(String[] args) {
        Animal a = new Dog();
        a.sound();
        a.sleep();
    }

}
