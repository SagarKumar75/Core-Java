interface Vehicle {
    void drive();

    default void honk() {
        System.out.println("Honk honk");
    }
}

class Car implements Vehicle {
    public void drive() {
        System.out.println("Car is driving..");
    }
}

public class DefaultMethodDemo {
    public static void main(String[] args) {
        Car c = new Car();
        c.drive();
        c.honk();
    }

}
