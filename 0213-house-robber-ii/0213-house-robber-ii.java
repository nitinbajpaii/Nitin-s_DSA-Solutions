class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if(n==1){
            return nums[0];
        }

        //case 1 first one included last one excluded
        int[] dp1 = new int[n];
        Arrays.fill(dp1,-1);
        int first = solve(nums,0,n-2,dp1);

        //case 2 first house excluded last one included
        int[] dp2 = new int[n];
        Arrays.fill(dp2,-1);
        int second = solve(nums,1,n-1,dp2);
        return Math.max(first,second);

    }
    public int solve(int nums[],int start,int end,int[] dp){
        if(start>end){
            return 0;
        }
        if(dp[start]!=-1){
            return dp[start];
        }

        int take = nums[start]+solve(nums,start+2,end,dp);
        int notTake = solve(nums,start+1,end,dp);
        return dp[start]=Math.max(take,notTake);
    }
}