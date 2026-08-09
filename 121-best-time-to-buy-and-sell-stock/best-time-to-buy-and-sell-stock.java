class Solution {
    public int maxProfit(int[] prices) {
        int buy = prices[0];
        int n = prices.length;

        int maxProfit = 0;
        for(int sell = 1; sell < n; sell++){
            int profit = prices[sell]-buy;
            
            maxProfit = Math.max(profit,maxProfit);
            buy = Math.min(buy, prices[sell]);
        }
        return maxProfit;
    }
}