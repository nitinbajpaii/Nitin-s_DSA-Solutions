class Solution {
    public int maximumGap(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        if(nums.length<2){
            return 0;
        }
        int count=0;
        for(int i=1;i<n;i++){
            int diff = nums[i]-nums[i-1];

            if(diff>count){
                count=diff;
            }
        }
        return count;
    }
}