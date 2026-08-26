class Solution {

    public int rob(int[] nums) {

        int n = nums.length;

        if (n == 1) {
            return nums[0];
        }

        // First house included, last excluded
        int first = solve(nums, 0, n - 2);

        // First house excluded, last included
        int second = solve(nums, 1, n - 1);

        return Math.max(first, second);
    }

    public int solve(int[] nums, int start, int end) {

        int[] dp = new int[nums.length];

        dp[start] = nums[start];

        for (int i = start + 1; i <= end; i++) {

            int take = nums[i];

            if (i > start + 1) {
                take += dp[i - 2];
            }

            int notTake = dp[i - 1];

            dp[i] = Math.max(take, notTake);
        }

        return dp[end];
    }
}