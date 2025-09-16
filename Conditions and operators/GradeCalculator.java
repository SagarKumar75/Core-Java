import java.util.*;

public class GradeCalculator {
    public static void main(String[] args) {

        int marks;
        Scanner s = new Scanner(System.in);
        marks = s.nextInt();

        if (marks > 90)
            System.out.println("grade A");
        else if (marks < 90 && marks > 80)
            System.out.println("grade B");
        else if (marks < 80 && marks > 70)
            System.out.println("grade C");
        else if (marks < 70 && marks > 60)
            System.out.println("grade D");
        else
            System.out.println("fail");
    }

}
