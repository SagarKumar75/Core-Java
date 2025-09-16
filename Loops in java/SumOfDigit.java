import java.util.*;

public class SumOfDigit {
    public static void main(String[] args) {
        int a;
        Scanner s = new Scanner(System.in);
        a = s.nextInt();
        int sum = 0;
        while (a > 0) {
            int r = a % 10;
            sum += r;
            a /= 10;

        }
        System.out.println(sum);

    }

}
