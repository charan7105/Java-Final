public class maxsubarrayprefix {
    public static void findMaxSubarraySum(int[] numbers) {
        int maxSum = Integer.MIN_VALUE;
        int[] prefix = new int[numbers.length];

        // Calculate Prefix Array
        prefix[0] = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            prefix[i] = prefix[i - 1] + numbers[i];
        }

        // The method findmaxsubarraysum takes an array of numbers and finds the maximum subarray sum using the prefix sum array.
        // The prefix array is calculated to store the cumulative sums of the input numbers.
        // The outer loop iterates over the possible starting indices of the subarray.
        // The inner loop calculates the sum of the subarray using the prefix sum array and updates the maximum sum if necessary.
        // Finally, the maximum subarray sum is printed.

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i; j < numbers.length; j++) {
                int curr = prefix[j] - (i > 0 ? prefix[i - 1] : 0);
                if (curr > maxSum) {
                    maxSum = curr;
                }
            }
        }

        System.out.println("Max Subarray Sum: " + maxSum);
                

    }

    public static void main(String[] args) {
        int[] numbers = {1, 21, -23, 12, 213, 12, -21};
        findMaxSubarraySum(numbers);
    }
}
