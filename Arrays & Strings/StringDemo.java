
public class StringDemo {
    public static void main(String[] args) {

        // immutable string
        String name = "Java";
        System.out.println(name.length());
        System.out.println(name.toUpperCase());
        System.out.println(name.charAt(2));

        // string comparison

        String a = "Hello";
        String b = "Hello";

        System.out.println(a.equals(b));
        System.out.println(a == b);
    }

}
