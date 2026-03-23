class Solution {
    public int maximumCount(int[] nums) {
        int n = nums.length;
        int posi_count =0;
        int neg_count =0;
        for(int i=0;i<n;i++){
            if(nums[i]>0){
                posi_count++;
            }
            if(nums[i]<0){
                neg_count++;
            }
        }
        return Math.max(posi_count,neg_count);
    }
}