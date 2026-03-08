class Solution {
    public int findMin(int[] nums) {
        int min = Integer.MAX_VALUE;
        int n = nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]<min){
                min=nums[i];
            }
        }
        return min;
    }
}