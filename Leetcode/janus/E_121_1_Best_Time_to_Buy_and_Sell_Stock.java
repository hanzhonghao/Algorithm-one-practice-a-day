/*
Say you have an array for which the ith element is the price of a given stock on day i.

If you were only permitted to complete at most one transaction (i.e., buy one and sell one share of the stock), design an algorithm to find the maximum profit.

Note that you cannot sell a stock before you buy one.

Example 1:

Input: [7,1,5,3,6,4]
Output: 5
Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
             Not 7-1 = 6, as selling price needs to be larger than buying price.
Example 2:

Input: [7,6,4,3,1]
Output: 0
Explanation: In this case, no transaction is done, i.e. max profit = 0.
 */
/*
Leetcode Accepted:
Runtime: 93 ms, faster than 15.79% of Java online submissions for Best Time to Buy and Sell Stock.
Memory Usage: 37.1 MB, less than 76.32% of Java online submissions for Best Time to Buy and Sell Stock.
 */
public class E_121_1_Best_Time_to_Buy_and_Sell_Stock {
    public static int maxProfit(int[] prices) {
        int max = 0;
        for (int i = 0; i < prices.length; i++) {

            for (int j = i; j < prices.length; j++) {
                if ((prices[j] - prices[i]) > max) {
                    max = prices[j] - prices[i];
                }
            }
        }

        return max;


    }

    public static void main(String[] args) {
        int[] a = {2,1,4};
        System.out.println(maxProfit(a));
    }

}
