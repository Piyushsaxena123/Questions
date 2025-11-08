public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {  // Start from i + 1 to avoid using the same element twice
                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j };
                }
            }
        }
        
        return new int[] {-1, -1}; // Return this if no solution is found
    }
    
    public static void main(String[] args) {
        int arr[] = {2, 7, 11, 15};
        int target = 9;
        int[] result = twoSum(arr, target);
        
        if (result[0] != -1 && result[1] != -1) {
            System.out.println("Indices: [" + result[0] + ", " + result[1] + "]");
        } else {
            System.out.println("No valid indices found");
        }
    }
}
