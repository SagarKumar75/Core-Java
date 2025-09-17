import java.util.*;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        map.put("Apple", 50);
        map.put("Banana", 20);
        map.put("Mango", 30);

        System.out.println("price of mango: " + map.get("Mango"));

        for (String key : map.keySet()) {
            System.out.println(key + " -> " + map.get(key));
        }
    }

}
