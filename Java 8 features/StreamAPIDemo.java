// Process collections in a declarative way (like SQL).

// Supports filtering, mapping, sorting, reducing.

import java.util.*;

public class StreamAPIDemo {
    public static void main(String[] args) {
        List<Integer> num = Arrays.asList(1, 2, 3, 4, 5, 6, 7);

        num.stream()
                .filter(n -> n % 2 == 0) // keep only even
                .map(n -> n * n) // square them
                .forEach(System.out::println);
    }

}
