class Solution {
    public int thirdMax(int[] nums) {
        long max =Long.MIN_VALUE;
        long smax= Long.MIN_VALUE;
        long tmax=Long.MIN_VALUE;
        int n = nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]==max || nums[i]==smax || nums[i]==tmax){
                continue;
            }
            else if(nums[i]>max){
                tmax=smax;
                smax=max;
                max=nums[i];
            }
            else if(nums[i]>smax){
                tmax=smax;
                smax=nums[i];
            }
            else if(nums[i]>tmax){
                tmax=nums[i];
            }
        }
        if(tmax==Long.MIN_VALUE){
            return (int) max;
        }
        else{
            return (int) tmax;
        }
    }
}