import java.util.*;

public class HashSetDemo {

    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

        set.add(20);
        set.add(20); // duplicate ignored
        set.add(30);
        set.add(10);

        System.out.println(set);
    }

}
