
public class WrapperDemo {
    public static void main(String[] args) {

        // AutoBoxing
        int a = 10;
        Integer num = a; // primitive ->Object

        // UnBoxing

        Integer x = 100;
        int b = x; // Objects -> primitive

        System.out.println("Autoboxing: " + num);
        System.out.println("Unboxing: " + b);

    }

}
