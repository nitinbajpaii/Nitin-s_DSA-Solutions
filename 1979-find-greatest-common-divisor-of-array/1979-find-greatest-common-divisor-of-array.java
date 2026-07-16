class Solution {
    public int findGCD(int[] nums) {
        int n = nums.length;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(nums[i]>max){
                max=nums[i];
            }
            if(nums[i]<min){
                min = nums[i];
            }
        }
        return gcd(min,max);
    }
    public int gcd(int i,int j){
        if(j==0){
            return i;
        }
        return gcd(j,i%j);
    }
}