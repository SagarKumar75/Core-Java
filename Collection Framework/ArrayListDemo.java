import java.util.*;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("apple");
        list.add("Banana");
        list.add("Mango");

        System.out.println(list);

        list.remove("Banana");
        System.out.println("After removing: " + list);

        System.out.println("First Element : " + list.get(0));
    }

}
