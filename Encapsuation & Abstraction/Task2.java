abstract class Shape {
    abstract void area();
}

class Circle extends Shape {
    int radius;

    void area() {
        System.out.println("area of circle : " + Math.PI * radius * radius);

    }
}

class Rectangle extends Shape {
    int length;
    int width;

    void area() {
        System.out.println("area of rectangle : " + length * width);
    }

}

class Triangle extends Shape {
    int base;
    int height;

    void area() {
        System.out.println("area of triangle : " + 0.5 * base * height);
    }
}

public class Task2 {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.radius = 5;
        c.area();
        Rectangle r = new Rectangle();
        r.length = 5;
        r.width = 10;
        r.area();
        Triangle t = new Triangle();
        t.base = 5;
        t.height = 10;
        t.area();

    }

}
