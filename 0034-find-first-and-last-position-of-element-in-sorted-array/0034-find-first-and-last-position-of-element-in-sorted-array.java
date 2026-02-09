class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first=-1,last=-1;
        int n = nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]==target){
                first=i;
                break;
            }
        }
        for(int i=n-1;i>=0;i--){
            if(nums[i]==target){
                last=i;
                break;
            }
        }
        return new int[] {first,last};
    }
}
