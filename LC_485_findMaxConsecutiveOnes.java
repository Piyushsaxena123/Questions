// LeetCode Question: Max Consecutive Ones
// Problem Link: https://leetcode.com/problems/max-consecutive-ones/description/
// Approach:
// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution {
    public int LC_485_findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int max = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                count++;          // increase streak
                max = Math.max(max, count);
            } else {
                count = 0;        // reset on zero
            }
        }
        return max;
    }
}
