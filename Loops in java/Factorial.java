import java.util.*;

public class Factorial {
    public static void main(String[] args) {
        int a;
        Scanner s = new Scanner(System.in);
        a = s.nextInt();
        int fact = 1;
        while (a > 0) {
            fact *= a;
            a--;

        }
        System.out.println(fact);

    }

}
