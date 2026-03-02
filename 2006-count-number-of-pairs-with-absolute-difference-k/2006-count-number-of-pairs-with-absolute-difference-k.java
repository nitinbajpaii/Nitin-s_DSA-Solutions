class Solution {
    public int countKDifference(int[] nums, int k) {
        int n = nums.length;
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(nums[i]-nums[j]==k || nums[j]-nums[i]==k){
                    count++;
                }
            }
        }
        return count;
    }
}