class Solution {
    public int[] leftRightDifference(int[] nums) {
        int total=0;
        int n = nums.length;
        for(int i=0;i<n;i++){
            total += nums[i];
        }
        int left=0;
        int[] res = new int[n];
        for(int i=0;i<n;i++){
            int right = total-left-nums[i];
            res[i]=Math.abs(left-right);
            left += nums[i];
        }
        return res;
    }
}