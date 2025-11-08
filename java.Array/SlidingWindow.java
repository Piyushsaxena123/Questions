public class SlidingWindow {
      public static long maximumSubarraySum(int[] nums, int k) {
        // BruteForce Approach
        // int maxsum = 0;
        // for(int i = 0; i<nums.length - k+1; i++){
        //     int sum = 0;
        //    for(int j = i; j<i+k; j++){
        //      sum+=nums[j];
        //    }
        //    maxsum = Math.max(maxsum, sum);
        // }
        // return maxsum;

        // Optimized Approach

           long maxsum = 0;
        long sum = 0;

        // Step 1: Take sum of first k elements
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }

        maxsum = sum;

        // Step 2: Use sliding window for the rest
        for (int i = 1; i < nums.length - k + 1; i++) {
            sum = sum - nums[i - 1] + nums[i + k - 1];
            maxsum = Math.max(maxsum, sum);
        }

        return maxsum;
    }

    
    public static void main(String[] args) {
        int nums[] = {100,200,300,400};
        int k = 2;
        System.out.println(maximumSubarraySum(nums, k));
    }
}
