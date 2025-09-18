import java.util.*;

public class LambdaDemo {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Java", "python", "c++");

        // Before java 8

        for (String n : names)
            System.out.println(n);

        // with lambda

        names.forEach(n -> System.out.println(n));

    }

}
