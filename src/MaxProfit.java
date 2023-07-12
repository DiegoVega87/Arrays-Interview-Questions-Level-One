public class MaxProfit {

    /*
    * Stock Trading Profit Maximization
    * You have been given a list of stock prices of a particular stock.
    * You want to maximize your profit by buying and selling the stock at the right time. On each day,
    * you can either buy the stock, sell the stock, or do nothing.
    * You can only hold at most one share of the stock at any time.
    * However, you can buy it then immediately sell it on the same day.
    * Write a function that takes in a list of stock prices and returns the maximum profit you can achieve.
    * If no profit can be made, return 0.
    *
    * Example 1:
    *  prices = {7, 1, 5, 3, 6, 4};
    *  expectedOutput = 5;
    * Example 2:
    * prices = {7, 6, 4, 3, 1}
    * int expectedOutput = 0;
    * */
    public static int maxProfit(int[] prices){

        if(prices.length < 1){
            return 0;
        }
        // Store the minimum priced item when found.
        int minBuy = Integer.MAX_VALUE;

        int maxProfit = 0;

        for(int value : prices){
            if(value < minBuy){
                minBuy = value;
            }else{
                maxProfit = Math.max(maxProfit, (value-minBuy));
            }
        }

        return maxProfit;
    }
}
