public class Arrays {
    public static void main(String[] args) {
        // Declaration & Initialization

        int[] numbers = { 1, 2, 3, 4, 5 };

        System.out.println(numbers[2]);

        // Loop through array

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }

        // enhanced for loop

        for (int i : numbers) {
            System.out.print(i + " ");
        }

        // multi-dimensional arrays

        int[][] matrix = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };
        System.out.println(matrix[1][2]);

        for (int i = 0; i < matrix[0].length; i++) {
            for (int j : matrix[i]) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

    }

}
