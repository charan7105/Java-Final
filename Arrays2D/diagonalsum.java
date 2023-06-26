package Arrays2D;

public class diagonalsum {
    public static int diagonalsuming(int numbers[][]) {
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                if (i == j) {
                    sum1 += numbers[i][j];
                }
                if (i + j == numbers.length - 1) {
                    sum2 += numbers[i][j];
                }
            }
        }
        return sum1 + sum2;
    }

    public static void main(String[] args) {
        int numbers[][] = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        int diagonalSum = diagonalsuming(numbers);
        System.out.println("The sum of the main diagonal and opposite diagonal elements is: " + diagonalSum);
    }
}
