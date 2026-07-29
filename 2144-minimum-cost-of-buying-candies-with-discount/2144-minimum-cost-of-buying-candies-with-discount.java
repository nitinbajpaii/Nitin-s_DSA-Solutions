class Solution {
    public int minimumCost(int[] cost) {
        int n = cost.length;
        Arrays.sort(cost);
        int sum=0;
        int count=0;
        for(int i=n-1;i>=0;i--){
            count++;
            if(count==3){
                count=0;
                continue;
            }
            sum += cost[i];
        }
        return sum;
    }
}