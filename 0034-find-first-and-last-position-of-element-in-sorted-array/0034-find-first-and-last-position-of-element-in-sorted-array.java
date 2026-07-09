class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] res = new int[2];
        res[0]= binary_search(nums,target,true);
        res[1]=binary_search(nums,target,false);
        return res;
    }
    public int binary_search(int[] nums,int target,boolean flag){
        int start=0;
        int res=-1;
        int end = nums.length-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(nums[mid]==target){
                res = mid;
                if(flag){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }
            else if(nums[mid]>target){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return res;
    }
}