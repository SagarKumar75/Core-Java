import java.util.*;

public class Multiplication {
    public static void main(String[] args) {
        int a;
        Scanner s = new Scanner(System.in);
        a = s.nextInt();
        for (int i = 1; i < 11; i++) {
            System.out.println(a + " * " + i + " = " + (a * i));
        }
    }

}
