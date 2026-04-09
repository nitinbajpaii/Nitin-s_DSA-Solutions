class Solution {
    public boolean canSortArray(int[] nums) {
        int n = nums.length;
        for(int i=0;i<n-1;i++){
            if(nums[i]>nums[i+1]){
                if(countSetbits(nums[i])!=countSetbits(nums[i+1])){
                    return false;
                }
                int temp = nums[i];
                nums[i]=nums[i+1];
                nums[i+1]=temp;
                i =-1;
            }
            
        }
        return true;
    }
    public int countSetbits(int n){
        int count=0;
        while(n>0){
            n = n & (n-1);
            count++;
        }
        return count;
    }
}