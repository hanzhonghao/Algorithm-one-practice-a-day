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
Runtime: 1 ms, faster than 84.90% of Java online submissions for Best Time to Buy and Sell Stock.
Memory Usage: 36.7 MB, less than 84.99% of Java online submissions for Best Time to Buy and Sell Stock.
Next challenges:

 */
public class E_121_2_Best_Time_to_Buy_and_Sell_Stock {
    public static int maxProfit(int[] prices) {
        int max = 0;
        if(prices.length < 1)
            return max;

        int min = prices[0];
        for(int i=1;i<prices.length;i++)
        {
            if(prices[i] <= min)
                min = prices[i];
            else
            {
                int count = prices[i] - min;
                if(count >= max)
                    max = count;
            }
        }
        return max;


    }

    public static void main(String[] args) {
        int[] a = {2,1,4};
        System.out.println(maxProfit(a));
    }

}
