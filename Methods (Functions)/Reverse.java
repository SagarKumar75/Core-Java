
public class Reverse {
    static String reverse(String s) {
        String rev = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            rev += s.charAt(i);
        }
        return rev;

    }

    public static void main(String[] args) {
        String rev = reverse("sagar");
        System.out.println(rev);
    }
}
