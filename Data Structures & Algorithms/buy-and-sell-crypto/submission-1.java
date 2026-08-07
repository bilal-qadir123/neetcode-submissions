class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int left = 0;
        int right = 1;

        for (int i = 2; i < prices.length; i++) {
            int profit = prices[right] - prices[left];

            if (profit > maxProfit) {
                maxProfit = profit;
            }
            if (prices[i] < prices[left] && left < prices.length - 2) {
                left ++;
            }
            if (right < prices.length - 1) {
                right ++;
            }
        }
        return maxProfit;
    }
}
