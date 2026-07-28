class Solution {
    public int triangularSum(int[] nums) {
        int n = nums.length;
        if(n==1){
            return nums[0];
        }
        while(n>1){
            int[] arr = new int[n-1];
            for(int i=0;i<n-1;i++){
                arr[i]= (nums[i]+nums[i+1])%10;
            }
            nums=arr;
            n--;
        }
        return nums[0];
    }
}