// LeetCode Question: Best Time to Buy and Sell Stock
// Problem Link: https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/
// Approach: Keep track of minimum price so far and maximum profit margin.
// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution {
    public int maxProfit(int[] prices) {
        int min = prices[0];
        int profit = 0;
        for(int p : prices){
            min = Math.min(min, p);
            profit = Math.max(profit, p - min);
        }
        return profit;
    }
}



