class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int ele = nums[0];
        int count=1;
        int freq=1;
        for(int i=1;i<n;i++){
            if(nums[i]==nums[i-1]){
                count++;
            }
            else{
                count=1;
            }

            if(freq<count){
                freq=count;
                ele=nums[i];
            }
        }
        return ele;
    }
}