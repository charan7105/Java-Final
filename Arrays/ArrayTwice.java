import java.util.Scanner;

public class ArrayTwice {
    public static void arrayTwiceFind(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    System.out.println("Yes");
                    return;
                }
            }
        }
        System.out.println("No");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter the number at index " + i + ": ");
            numbers[i] = sc.nextInt();
        }
        arrayTwiceFind(numbers);
    }
}
