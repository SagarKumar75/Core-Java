
public class MultiCatch {
    public static void main(String[] args) {
        try {
            int[] arr = { 1, 2, 3 };
            System.out.println(arr[6]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("error : " + e);
        } catch (Exception e) {
            System.out.println("error: " + e);
        }
    }

}
