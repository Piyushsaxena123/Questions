import java.util.Arrays;
public class leetcode34 {
     public static int[] searchRange(int[] nums, int target) {
        int[] result = {-1, -1};
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                if (result[0] == -1) {
                    result[0] = i; // First occurrence
                }
                result[1] = i; // Keep updating to last occurrence
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 9;
        System.out.println(Arrays.toString(searchRange(nums, target)));  // Output: [3, 4]
    }
}
