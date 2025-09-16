public class MethodsDemo {
    static int add(int a, int b) {
        return a + b;
    }

    static double add(double a, double b) {
        return a + b;
    }

    static void greet(String name) {
        System.out.println("Hello, " + name);
    }

    public static void main(String[] args) {
        int sum = add(6, 9);
        System.out.println(sum);
        greet("naman");
        double doubleSum = add(10.7, 11.3);
        System.out.println(doubleSum);
    }
}