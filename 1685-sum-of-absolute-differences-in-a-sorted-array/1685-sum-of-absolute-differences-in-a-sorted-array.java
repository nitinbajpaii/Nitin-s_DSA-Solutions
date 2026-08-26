class Solution {
    public int[] getSumAbsoluteDifferences(int[] nums) {

        int n = nums.length;
        int[] ans = new int[n];

        
        for(int j = 0; j < n; j++) {
            ans[0] += nums[j] - nums[0];
        }

        
        for(int i = 1; i < n; i++) {

            int diff = nums[i] - nums[i - 1];

            ans[i] = ans[i - 1] + diff * (2 * i - n);
        }

        return ans;
    }
}