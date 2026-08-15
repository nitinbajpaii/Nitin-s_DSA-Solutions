class Solution {
    public int longestSubsequence(int[] nums) {
        int n = nums.length;
        int xor=0;
        int i=0;
        boolean hasNonZero=false;
        for(int num: nums){
            xor ^= num;
            if(num!=0){
                hasNonZero = true;
            }
        }
        if(!hasNonZero){
            return 0;
        }
        return xor!=0 ? n:n-1;
    }
}