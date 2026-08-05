class Solution {
    public int jump(int[] nums) {
        int n = nums.length;
        int end=0;
        int jump=0;
        int max=0;
        for(int i=0;i<n-1;i++){
            max = Math.max(max,i+nums[i]);

            if(i==end){
                jump++;
                end=max;
            }
        }
        return jump;
    }
}