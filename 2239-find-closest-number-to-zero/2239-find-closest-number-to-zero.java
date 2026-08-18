class Solution {
    public int findClosestNumber(int[] nums) {
        int number = 0;
        int min = Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            int diff = Math.abs(nums[i]);

            if(diff<min){
                min = diff;
                number = nums[i];
            }
            else if(diff==min && nums[i]>number){
                number = nums[i];
            }
        }
        return number;
    }
}