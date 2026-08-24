class Solution {
    public boolean canPartition(int arr[]) {
        // code here
        int n = arr.length;
        int sum=0;
        for(int x: arr){
            sum += x;
        }
        if(sum%2!=0){
            return false;
        }
        int temp = sum/2;
        
        Boolean dp[][] = new Boolean[n+1][temp+1];
        return solve(arr,temp,n,dp);
    }
    static boolean solve(int[] arr,int sum,int n,Boolean[][]dp){
        if(sum==0){
            return true;
        }
        if(n==0){
            return false;
        }
        if(dp[n][sum]!=null){
            return dp[n][sum];
        }
        if(sum>=arr[n-1]){
            boolean take = solve(arr,sum-arr[n-1],n-1,dp);
            boolean notTake = solve(arr,sum,n-1,dp);
            return dp[n][sum]=take||notTake;
        }
        else return dp[n][sum]=solve(arr,sum,n-1,dp);
    }
}