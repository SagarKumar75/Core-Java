class Animal {
    void speak() {
        System.out.println("Animal makes a sound");
    }
}

class Cat extends Animal {
    void speak() {
        System.out.println("Cat meows");
    }
}

class Dog extends Animal {
    void speak() {
        System.out.println("Dog barks");
    }
}

class Cow extends Animal {
    void speak() {
        System.out.println("Cow moos");
    }
}

public class Task1 {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();
        Animal cow = new Cow();

        dog.speak();
        cat.speak();
        cow.speak();
    }

}
