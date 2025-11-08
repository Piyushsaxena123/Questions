import java.util.Arrays;

public class leetcode3158b {
    public static int duplicateNumbersXOR(int[] nums) {
        Arrays.sort(nums);  // Sort array to group duplicates
        int xor = 0;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                xor ^= nums[i]; // XOR the duplicate
                // Skip all same values to avoid XORing same duplicate multiple times
                while (i + 1 < nums.length && nums[i] == nums[i + 1]) {
                    i++;
                }
            }
        }

        return xor;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 1};
        System.out.println(duplicateNumbersXOR(nums)); // Output: 3
    }
}

