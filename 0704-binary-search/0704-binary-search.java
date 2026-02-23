class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;
        int start=0;
        int end = n-1;
        int res=-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(nums[mid]==target){
                res = mid;
                start=mid+1;
            }
            else if(nums[mid]>target){
                end = mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return res;
    }
}