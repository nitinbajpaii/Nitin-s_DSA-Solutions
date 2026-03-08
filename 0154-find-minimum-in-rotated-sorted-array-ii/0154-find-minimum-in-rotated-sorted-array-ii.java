class Solution {
    public int findMin(int[] nums) {
        int n = nums.length;
        int min = Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(nums[i]<min){
                min = nums[i];
            }
        }
        return min;
    }
}