class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);
        return solve(nums,0,dp);
    }
    public int solve(int[] nums,int i,int[]dp){
        if(i>=nums.length){
            return 0;
        }
        if(dp[i]!=-1){
            return dp[i];
        }
        int take = nums[i]+solve(nums,i+2,dp);
        int notTake = solve(nums,i+1,dp);
        return dp[i] =Math.max(take,notTake);
    }
    
}