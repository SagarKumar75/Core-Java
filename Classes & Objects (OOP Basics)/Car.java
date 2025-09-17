
public class Car {
    String brand;
    String model;
    int year;

    // constructor

    Car(String b, String m, int y) {
        brand = b;
        model = m;
        year = y;
    }

    void displayInfo() {
        System.out.println(year + " " + brand + " " + model);
    }

    public static void main(String[] args) {
        Car car1 = new Car("Honda", "civic", 2022);
        Car car2 = new Car("Toyota", "corolla", 2023);

        car1.displayInfo();
        car2.displayInfo();
    }

}
