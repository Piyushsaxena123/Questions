import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class leetcode_4_Sum {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        int n = nums.length;
        
        Arrays.sort(nums);

        for (int i = 0; i < n; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue;  // Skip duplicate i

            for (int j = i + 1; j < n; j++) {
                if (j > i + 1 && nums[j] == nums[j - 1]) continue;  // Skip duplicate j

                int p = j + 1, q = n - 1;

                while (p < q) {
                    long sum = (long) nums[i] + (long) nums[j] + (long) nums[p] + (long) nums[q];

                    if (sum == target) {
                        ans.add(Arrays.asList(nums[i], nums[j], nums[p], nums[q]));
                        p++;
                        q--;

                        while (p < q && nums[p] == nums[p - 1]) p++;  // Skip duplicates
                        while (p < q && nums[q] == nums[q + 1]) q--;  // Skip duplicates
                    } else if (sum < target) {
                        p++;
                    } else {
                        q--;
                    }
                }
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        leetcode_4_Sum fs = new leetcode_4_Sum();
        int[] nums = {1, 0, -1, 0, -2, 2};
        int target = 0;

        List<List<Integer>> result = fs.fourSum(nums, target);

        for (List<Integer> quad : result) {
            System.out.println(quad);
        }
    }
}
