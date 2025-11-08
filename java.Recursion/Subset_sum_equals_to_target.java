/*
 * Given an array arr of n integers and an integer target, determine if there is a subset of the given array with a sum equal to the given target.


Examples:
Input: arr = [1, 2, 7, 3], target = 6

Output: True

Explanation: There is a subset (1, 2, 3) with sum 6.

Input: arr = [2, 3, 5], target = 6

Output: False

Explanation: There is no subset with sum 6.

Input: arr = [7, 54, 4, 12, 15, 5], target = 9
 */
import java.util.ArrayList;

public class Subset_sum_equals_to_target {

    // Recursive function to generate all possible subset sums
    public static void func(int i, int sum, int[] arr, int N, ArrayList<Integer> sumSubsets) {
        if (i == N) {
            sumSubsets.add(sum);
            return;
        }

        // Pick the element
        func(i + 1, sum + arr[i], arr, N, sumSubsets);

        // Don't pick the element
        func(i + 1, sum, arr, N, sumSubsets);
    }

    // Function to check if any subset sum equals the target
    public boolean isSubsetSum(int[] arr, int target) {
        ArrayList<Integer> sumSubsets = new ArrayList<>();
        func(0, 0, arr, arr.length, sumSubsets);
        return sumSubsets.contains(target);
    }

    // Main method to test the function
    public static void main(String[] args) {
        Subset_sum_equals_to_target obj = new Subset_sum_equals_to_target();
        int[] arr = {3, 34, 4, 12, 5, 2};
        int target = 9;

        boolean result = obj.isSubsetSum(arr, target);
        System.out.println("Is there a subset with the target sum? " + result);
    }
}
