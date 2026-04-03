class Solution {
    public int maximumStrongPairXor(int[] nums) {
        int n = nums.length;
        int maxi = 0;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                if(Math.abs(nums[i]-nums[j])<=Math.min(nums[i],nums[j])){
                    maxi = Math.max(nums[i]^nums[j],maxi);
                } 
            }
        }
        return maxi;
    }
}