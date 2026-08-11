class Solution {
    public int missingInteger(int[] nums) {
        int sum=nums[0];
        int n = nums.length;
        for(int i=1;i<n;i++){
            if(nums[i-1]==nums[i]-1){
                sum += nums[i];
            }
            else{
                break;
            }
        }
        HashSet<Integer> set = new HashSet<>();
        for(int x:nums){
            set.add(x);
        }
        while(set.contains(sum)){
            sum++;
        }
        return sum;
    }
}