import java.util.*;

public class Task2 {
    public static void main(String[] args) {
        HashMap<String, Integer> mp = new HashMap<>();

        mp.put("Sagar", 50);
        mp.put("Rahul", 80);
        mp.put("kishan", 70);

        mp.put("ranjan", 90);
        mp.put("manish", 67);

        for (String key : mp.keySet()) {
            if (mp.get(key) < 75)
                System.out.println(key);
        }
    }

}
