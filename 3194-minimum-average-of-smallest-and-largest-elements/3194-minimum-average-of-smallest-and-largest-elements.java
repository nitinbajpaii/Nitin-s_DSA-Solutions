class Solution {
    public double minimumAverage(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int i=0;
        int j=n-1;
        double ans = Double.MAX_VALUE;
        while(i<j){
            double sum = (nums[i]+nums[j])/2.0;
            ans = Math.min(ans,sum);
            i++;
            j--;

        }
        return ans;
    }
}