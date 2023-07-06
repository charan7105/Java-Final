package Recursion;

public class lastoccurence6{
    public static int findLast(int[] arr, int i, int key) {
        // Base case
        if (i < 0) {
            return -1;
        }

        // Recursive case
        if (arr[i] == key) {
            return i;
        }

        // Recursive call
        return findLast(arr, i - 1, key);
    }

    public static void main(String[] args) {
        int[] arr = {12, 34, 6, 1, 5, 5231, 15, 67, 23, 12, 2, 6, 3, 1, 6, 8, 64, 34};
        int key = 6;
        int lastIndex = findLast(arr, arr.length - 1, key);
        System.out.println("Last occurrence of " + key + " is at index: " + lastIndex);
    }
}
