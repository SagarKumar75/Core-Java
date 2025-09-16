import java.util.*;

public class SimpleCalculator {
    public static void main(String[] args) {
        int a, b;
        Scanner s = new Scanner(System.in);
        a = s.nextInt();
        b = s.nextInt();

        char op = s.next().charAt(0);

        switch (op) {
            case '+':
                System.out.println(a + b);
                break;
            case '-':
                System.out.println(a - b);
                break;
            case '*':
                System.out.println(a * b);
                break;
            case '/':
                System.out.println(a / b);
                break;
            default:
                System.out.println("enter valid op");
        }
    }

}
