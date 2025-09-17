
public class task1 {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 4, 3, 16, 9, 11 };
        int max = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max)
                max = nums[i];
        }
        System.out.println(max);
    }

}
