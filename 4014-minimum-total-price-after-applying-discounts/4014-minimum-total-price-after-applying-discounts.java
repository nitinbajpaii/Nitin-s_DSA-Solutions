class Solution {
    public double minPrice(int[] prices, int[] discounts) {
        Arrays.sort(prices);
        Arrays.sort(discounts);
        int p = prices.length-1;
        int d = discounts.length-1;
        double sum=0;
        while(p>=0 && d>=0){
            sum += prices[p]*(100-discounts[d])/100.0;
            p--;
            d--;
        }
        while(p>=0){
            sum += prices[p];
            p--;
        }
        return sum;
    }
}