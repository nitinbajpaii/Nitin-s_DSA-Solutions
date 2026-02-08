class Solution {
    public int removeDuplicates(int[] nums) {
        int index=0;
        int n = nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]!=nums[index]){
                index++;
            }
            nums[index]=nums[i];
        }
        return index+1;
    }
}