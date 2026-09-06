class Solution {
    public int minIncrementForUnique(int[] nums) {
        Arrays.sort(nums);
        int count=0;
        for(int i=1;i<nums.length;i++){
            while(nums[i]<=nums[i-1]){
                nums[i]++;
                count++;
            }
        }
        return count;
    }
}