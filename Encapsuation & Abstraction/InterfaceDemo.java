interface Vehicle {
    void drive();

}

class Car implements Vehicle {
    public void drive() {
        System.out.println("Car is driving...");

    }
}

public class InterfaceDemo {
    public static void main(String[] args) {
        Vehicle v = new Car();
        v.drive();
    }

}
