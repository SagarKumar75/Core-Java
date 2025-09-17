
//parent class
class Animal {
    void eat() {
        System.out.println("This animal eats food");
    }
}

// child class
class Dog extends Animal {
    void bark() {
        System.out.println("The dog barks");
    }
}

public class InheritanceDemo {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();
        d.bark();
    }

}
