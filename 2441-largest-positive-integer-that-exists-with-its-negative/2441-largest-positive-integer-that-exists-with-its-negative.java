class Solution {
    public int findMaxK(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int n = nums.length;
        for(int x: nums){
            set.add(x); 
        }
        int max = -1;
        for(int x: nums){
            if(set.contains(-x)){
                max = Math.max(x,max);
            }
        }
        return max;
    }

}