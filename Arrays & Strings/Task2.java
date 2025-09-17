
public class Task2 {
    public static void main(String[] args) {
        int[] nums = { 1, 3, 5, 7 };
        int i = 0;
        int j = nums.length - 1;
        for (int num : nums)
            System.out.print(num);

        System.out.println();
        while (i < j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
        for (int num : nums)
            System.out.print(num);

    }

}
