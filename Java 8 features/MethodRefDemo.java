import java.util.*;

public class MethodRefDemo {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Java", "pyhton", "C++");

        names.forEach(System.out::println); // instead of n-> System.out.println(n);
    }

}
