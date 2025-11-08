import java.util.ArrayList;
import java.util.List;

public class leetcode442 {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]) - 1; // The values in the array are from 1 to n, but array indices are from 0 to n-1.

            if (nums[index] < 0) {
                result.add(Math.abs(nums[i]));// If it’s negative, it means we’ve seen this number before.
            } else {
                nums[index] = -nums[index]; // If it’s not negative yet, this means this number is appearing for the first time.
            }
        }

        return result;
    }
    public static void main(String[] args) {
        int nums[] = {4,3,2,7,8,2,3,1};
        leetcode442 obj = new leetcode442();
        System.out.println(obj.findDuplicates(nums));
    }
}
