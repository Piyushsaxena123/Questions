public class leetcode122 {
    // BEST TIME TO BUY AND SELL STOCK 2.
    /* Input: prices = [7,1,5,3,6,4]
Output: 7
Explanation: Buy on day 2 (price = 1) and sell on day 3 (price = 5), profit = 5-1 = 4.
Then buy on day 4 (price = 3) and sell on day 5 (price = 6), profit = 6-3 = 3.
Total profit is 4 + 3 = 7.
Example 2:
Input: prices = [1,2,3,4,5]
Output: 4
Explanation: Buy on day 1 (price = 1) and sell on day 5 (price = 5), profit = 5-1 = 4.
Total profit is 4.
Example 3:
Input: prices = [7,6,4,3,1]
Output: 0
Explanation: There is no way to make a positive profit, so we never buy the stock to achieve the maximum profit of 0.*/
 public static int maxProfit(int[] prices) {
        int buyPrices = prices[0];
        int maxProfit = 0;
        for(int i = 1; i<prices.length; i++){
            if(prices[i] > buyPrices){
                maxProfit += prices[i] - buyPrices;
            }
            buyPrices = prices[i];
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        int prices[] = {7,1,5,3,6,4};
        System.out.println("Profit = " + maxProfit(prices));
    }
}
