class Solution {
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int n = prices.length;
        int max=0;
        for(int i=0;i<n;i++){
            if(prices[i]<min){
                min = prices[i];
            }
            int profit = prices[i]-min;

            if(profit>max){
                max=profit;
            }
        }
        return max;
    }
}