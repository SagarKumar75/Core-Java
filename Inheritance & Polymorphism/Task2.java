class Shape {
    void area() {

    }
}

class Circle extends Shape {
    int radius;

    Circle(int r) {
        radius = r;
    }

    void area() {
        System.out.println("area of circle having radius is :" + Math.PI * radius * radius);

    }
}

class Rectangle extends Shape {
    int length, breadth;

    void area() {
        System.out.println("area of rectangle is :" + length * breadth);

    }
}

public class Task2 {

    public static void main(String[] args) {
        Shape c = new Circle(10);

        c.area();

        // Shape r=new Rectangle(); // you cant access the vairbale directly

        Rectangle r = new Rectangle();

        r.length = 10;
        r.breadth = 20;
        r.area();

    }

}
