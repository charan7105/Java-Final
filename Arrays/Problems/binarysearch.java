package Problems;
import java.util.*; // Import the Lib


public class binarysearch {
    public static void searching(int Numbers[], int key) {
        int start = 0;
        int end = Numbers.length - 1;
        int mid;

        while (start <= end) {
            mid = (start + end) / 2;

            if (Numbers[mid] == key) {
                System.out.println("Key found at index: " + mid);
                return; // Exit the method after finding the key
            } else if (Numbers[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        System.out.println("Key not found in the array.");
    }

    public static void main(String[] args) {
        int[] Numbers = {23, 45, 14, 54, 24, 12};
        Arrays.sort(Numbers);
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the key: ");
        int key = sc.nextInt();

        //Now Call the Method
        searching(Numbers, key);
    }
}